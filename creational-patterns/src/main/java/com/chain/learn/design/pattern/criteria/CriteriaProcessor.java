package com.chain.learn.design.pattern.criteria;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 9:07 PM
 */

public interface CriteriaProcessor<T> {

    CriteriaProcessor<T> inter(Criteria<T> criteria);

    CriteriaProcessor<T> union(Criteria<T> criteria);

    CriteriaProcessor<T> inter(CriteriaProcessor<T> criteriaProcessor);

    CriteriaProcessor<T> union(CriteriaProcessor<T> criteriaProcessor);

    List<T> result();
}
