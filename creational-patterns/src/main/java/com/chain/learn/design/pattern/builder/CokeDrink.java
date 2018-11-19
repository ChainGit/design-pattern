package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:36 PM
 */

public class CokeDrink extends AbstractFood implements IDrink {

    public static CokeDrinkBuilder getBuilder() {
        return new CokeDrinkBuilder();
    }

    public static class CokeDrinkBuilder implements IBuild<CokeDrink> {

        private IDrink drink = new CokeDrink();

        public CokeDrinkBuilder setName(String name) {
            drink.setName(name);
            return this;
        }

        public CokeDrinkBuilder setPrice(BigDecimal price) {
            drink.setPrice(price);
            return this;
        }

        @Override
        public CokeDrink build() {
            return (CokeDrink) drink;
        }
    }
}
