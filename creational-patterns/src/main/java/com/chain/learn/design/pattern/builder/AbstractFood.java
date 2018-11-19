package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:32 PM
 */

public abstract class AbstractFood implements IFood {

    private String name;
    private BigDecimal price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
