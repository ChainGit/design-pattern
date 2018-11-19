package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 2:35 PM
 */

public class BeefBurger extends AbstractFood implements IBurger {

    public static BeefBurgerBuilder getBuilder() {
        return new BeefBurgerBuilder();
    }

    public static class BeefBurgerBuilder implements IBuild<BeefBurger> {

        private IBurger burger = new BeefBurger();

        public BeefBurgerBuilder setName(String name) {
            burger.setName(name);
            return this;
        }

        public BeefBurgerBuilder setPrice(BigDecimal price) {
            burger.setPrice(price);
            return this;
        }

        @Override
        public BeefBurger build() {
            return (BeefBurger) burger;
        }
    }

}
