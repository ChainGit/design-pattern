package com.chain.learn.design.pattern.criteria;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 10:48 AM
 */

public class ChildCriteria implements Criteria<Person> {

    @Override
    public List<Person> filter(List<Person> scrList) {
        if (CollectionUtils.isEmpty(scrList)) {
            return scrList;
        }

        List<Person> dstList = new ArrayList<>(scrList.size());
        for (Person person : scrList) {
            if (person.getAge() != null && person.getAge() < PersonConstants.ADULT_AGE) {
                dstList.add(person);
            }
        }

        return dstList;
    }
}
