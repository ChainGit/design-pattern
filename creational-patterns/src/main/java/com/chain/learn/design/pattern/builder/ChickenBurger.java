package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:35 PM
 */

public class ChickenBurger extends AbstractFood implements IBurger {

    public static ChickenBurgerBuilder getBuilder() {
        return new ChickenBurgerBuilder();
    }

    public static class ChickenBurgerBuilder implements IBuild<ChickenBurger> {

        private IBurger burger = new ChickenBurger();

        public ChickenBurgerBuilder setName(String name) {
            burger.setName(name);
            return this;
        }

        public ChickenBurgerBuilder setPrice(BigDecimal price) {
            burger.setPrice(price);
            return this;
        }

        @Override
        public ChickenBurger build() {
            return (ChickenBurger) burger;
        }
    }
}
