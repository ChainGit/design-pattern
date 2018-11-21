package com.chain.learn.design.pattern.criteria;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 11:18 AM
 */

public abstract class AbstractCriteriaProcessor<T> implements CriteriaProcessor<T> {

    private Queue<CriteriaNode> criteriaNodeQueue = new ConcurrentLinkedQueue<>();

    private List<T> srcList;

    public AbstractCriteriaProcessor(List<T> srcList) {
        if (srcList == null) {
            throw new RuntimeException("scrList is null");
        }
        this.srcList = srcList;
    }

    @Override
    public CriteriaProcessor<T> inter(Criteria<T> criteria) {
        return chain(criteria, CriteriaEnum.INTER);
    }

    @Override
    public CriteriaProcessor<T> inter(CriteriaProcessor<T> criteriaProcessor) {
        return chain(criteriaProcessor, CriteriaEnum.P_INTER);
    }

    @Override
    public CriteriaProcessor<T> union(CriteriaProcessor<T> criteriaProcessor) {
        return chain(criteriaProcessor, CriteriaEnum.P_UNION);
    }

    @Override
    public CriteriaProcessor<T> union(Criteria<T> criteria) {
        return chain(criteria, CriteriaEnum.UNION);
    }

    protected CriteriaProcessor<T> chain(CriteriaProcessor<T> criteriaProcessor, CriteriaEnum criteriaEnum) {
        if (criteriaProcessor == null) {
            throw new RuntimeException("criteria processor is null");
        }

        criteriaNodeQueue.offer(new CriteriaNode(criteriaProcessor, criteriaEnum));

        return this;
    }

    protected CriteriaProcessor<T> chain(Criteria<T> criteria, CriteriaEnum criteriaEnum) {
        if (criteria == null) {
            throw new RuntimeException("criteria is null");
        }

        criteriaNodeQueue.offer(new CriteriaNode(criteria, criteriaEnum));

        return this;
    }

    @Override
    public List<T> result() {
        if (CollectionUtils.isEmpty(criteriaNodeQueue) || CollectionUtils.isEmpty(srcList)) {
            return srcList;
        }

        List<T> inputList = srcList;
        List<T> filterList = null;
        for (CriteriaNode criteriaNode : criteriaNodeQueue) {
            switch (criteriaNode.criteriaEnum) {
                default:
                    break;
                case INTER:
                    inputList = filterList = criteriaNode.criteria.filter(inputList);
                    break;
                case P_INTER:
                    filterList = criteriaNode.criteriaProcessor.result();
                    Set<T> filterSet = new HashSet<>(filterList);
                    List<T> interList = new ArrayList<>(filterList.size());
                    for (T t : inputList) {
                        if (filterSet.contains(t)) {
                            interList.add(t);
                        }
                    }
                    inputList = interList;
                    break;
                case UNION:
                    filterList = criteriaNode.criteria.filter(inputList);
                    inputList.addAll(filterList);
                    inputList = new ArrayList<>(new HashSet<>(inputList));
                    break;
                case P_UNION:
                    filterList = criteriaNode.criteriaProcessor.result();
                    inputList.addAll(filterList);
                    inputList = new ArrayList<>(new HashSet<>(inputList));
                    break;
            }
        }

        return inputList;
    }

    protected enum CriteriaEnum {

        INTER(0),
        UNION(1),
        P_INTER(2),
        P_UNION(3),
        ;

        private int type;

        CriteriaEnum(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public static CriteriaEnum getType(int type) {
            for (CriteriaEnum enu : values()) {
                if (enu.type == type) {
                    return enu;
                }
            }

            return null;
        }

        public static CriteriaEnum getType(Integer type) {
            return type == null ? null : getType(type.intValue());
        }
    }

    protected class CriteriaNode {

        private Criteria<T> criteria;
        private CriteriaProcessor<T> criteriaProcessor;
        private CriteriaEnum criteriaEnum;

        public CriteriaNode() {
        }

        public CriteriaNode(Criteria<T> criteria, CriteriaEnum criteriaEnum) {
            this.criteria = criteria;
            this.criteriaEnum = criteriaEnum;
        }

        public CriteriaNode(CriteriaProcessor<T> criteriaProcessor, CriteriaEnum criteriaEnum) {
            this.criteriaProcessor = criteriaProcessor;
            this.criteriaEnum = criteriaEnum;
        }
    }
}
