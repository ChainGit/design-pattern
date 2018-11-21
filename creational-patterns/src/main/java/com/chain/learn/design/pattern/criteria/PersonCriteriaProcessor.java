package com.chain.learn.design.pattern.criteria;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 9:07 PM
 */

public class PersonCriteriaProcessor extends AbstractCriteriaProcessor<Person> implements CriteriaProcessor<Person> {

    public PersonCriteriaProcessor(List<Person> srcList) {
        super(srcList);
    }

    public static CriteriaProcessor<Person> of(List<Person> srcList) {
        if (srcList == null) {
            throw new RuntimeException("srcList is null");
        }

        return new PersonCriteriaProcessor(srcList);
    }
}
