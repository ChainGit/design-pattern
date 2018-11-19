package com.chain.learn.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:37 PM
 */

public class Meal {

    private List<MealItem> itemList = new ArrayList<>();

    public List<MealItem> getItemList() {
        return itemList;
    }

    public static MealBuilder getBuilder() {
        return new MealBuilder();
    }

    public static class MealBuilder implements IBuild<Meal> {

        private Meal meal = new Meal();

        public MealBuilder add(MealItem item) {
            meal.getItemList().add(item);
            return this;
        }

        @Override
        public Meal build() {
            return meal;
        }
    }
}
