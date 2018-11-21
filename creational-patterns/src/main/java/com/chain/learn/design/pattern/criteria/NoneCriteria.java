package com.chain.learn.design.pattern.criteria;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 11:57 AM
 */

public class NoneCriteria implements Criteria<Person> {

    @Override
    public List<Person> filter(List<Person> scrList) {
        return scrList;
    }
}
