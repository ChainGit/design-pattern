package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:37 PM
 */

public class MilkDrink extends AbstractFood implements IDrink {

    public static MilkDrinkBuilder getBuilder() {
        return new MilkDrinkBuilder();
    }

    public static class MilkDrinkBuilder implements IBuild<MilkDrink> {

        private IDrink drink = new MilkDrink();

        public MilkDrinkBuilder setName(String name) {
            drink.setName(name);
            return this;
        }

        public MilkDrinkBuilder setPrice(BigDecimal price) {
            drink.setPrice(price);
            return this;
        }

        @Override
        public MilkDrink build() {
            return (MilkDrink) drink;
        }
    }

}
