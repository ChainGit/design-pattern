package com.chain.learn.design.pattern.builder;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:52 PM
 */

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public static User of(String name) {
        return new User(name);
    }
}
