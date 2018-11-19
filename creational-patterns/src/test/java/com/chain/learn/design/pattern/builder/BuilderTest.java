package com.chain.learn.design.pattern.builder;

import com.chain.learn.design.pattern.common.utils.PrintUtils;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 4:28 PM
 */

public class BuilderTest {

    @Test
    public void test() {
        IDirector<Meal> director = new MealDirector();

        Order order = null;

        order = new Order();
        order.setUser(User.of("jack"));
        order.setMeal(director.direct(MenuEnum.MALE.getType()));
        PrintUtils.println(getOrderDetail(order));

        order = new Order();
        order.setUser(User.of("mary"));
        order.setMeal(director.direct(MenuEnum.FEMALE.getType()));
        PrintUtils.println(getOrderDetail(order));
    }

    private static final String NL = System.getProperty("line.separator", "\n");

    private String getOrderDetail(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("order:").append(NL);

        if (order == null) {
            return sb.toString();
        }

        sb.append("- user:").append(NL);
        sb.append("-- name:").append(order.getUser().getName()).append(NL);

        sb.append("- meal:").append(NL);

        BigDecimal total = new BigDecimal(0);

        for (MealItem item : order.getMeal().getItemList()) {
            total = total.add(item.getFood().getPrice());

            sb.append("-- food:").append(NL);
            sb.append("--- name:")
                    .append(item.getFood().getName())
                    .append(", price:")
                    .append(item.getFood().getPrice().setScale(2, BigDecimal.ROUND_HALF_UP))
                    .append(NL);
        }

        sb.append("-- summary:").append(NL);
        sb.append("--- amount:")
                .append(order.getMeal().getItemList().size())
                .append(", total:").append(total.setScale(2, BigDecimal.ROUND_HALF_UP))
                .append(NL);

        return sb.toString();
    }

}
