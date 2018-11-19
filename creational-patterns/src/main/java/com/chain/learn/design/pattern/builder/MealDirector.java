package com.chain.learn.design.pattern.builder;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:54 PM
 */

public class MealDirector implements IDirector<Meal> {

    @Override
    public Meal direct(int type) {
        MenuEnum menuEnum = MenuEnum.getType(type);
        if (menuEnum == null) {
            return null;
        }

        Meal meal = null;
        switch (menuEnum) {
            default:
                meal = null;
                break;
            case MALE:
                meal = directMale();
                break;
            case FEMALE:
                meal = directFemale();
                break;
        }
        return meal;
    }

    private Meal directFemale() {
        return Meal.getBuilder()
                .add(MealItem.of(ChickenBurger.getBuilder()
                        .setName("chicken-burger")
                        .setPrice(new BigDecimal(2.4f))
                        .build())
                ).add(MealItem.of(MilkDrink.getBuilder()
                        .setName("milk-drink")
                        .setPrice(new BigDecimal(3.41f))
                        .build())
                ).build();
    }

    private Meal directMale() {
        return Meal.getBuilder()
                .add(MealItem.of(BeefBurger.getBuilder()
                        .setName("beef-burger")
                        .setPrice(new BigDecimal(1.23f))
                        .build())
                ).add(MealItem.of(CokeDrink.getBuilder()
                        .setName("coke-drink")
                        .setPrice(new BigDecimal(2.4f))
                        .build())
                ).build();
    }
}
