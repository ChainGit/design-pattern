package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:29 PM
 */

public interface IPrice {

    void setPrice(BigDecimal price);

    BigDecimal getPrice();

}
