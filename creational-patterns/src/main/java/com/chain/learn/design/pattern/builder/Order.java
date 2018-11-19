package com.chain.learn.design.pattern.builder;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:52 PM
 */

public class Order {

    private User user;
    private Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
