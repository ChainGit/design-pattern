package com.chain.learn.design.pattern.criteria;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 10:41 AM
 */

public interface Criteria<T> {

    List<T> filter(List<T> scrList);
}
