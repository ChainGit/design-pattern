package com.chain.learn.design.pattern.builder;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:38 PM
 */

public class MealItem {

    private IFood food;

    public MealItem() {
    }

    public MealItem(IFood food) {
        this.food = food;
    }

    public IFood getFood() {
        return food;
    }

    public void setFood(IFood food) {
        this.food = food;
    }

    public static MealItem of(IFood food) {
        return new MealItem(food);
    }
}
