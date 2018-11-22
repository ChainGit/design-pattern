package com.chain.learn.design.pattern.decorator;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 11:01 AM
 */

public class DecoratorPatternTest {

    @Test
    public void test() {
        Person person = Person.builder().id(1L).name("jack").age(18).gender(PersonConstants.MALE_GENDER).build();

        Logger logger = null;

        logger = new SimpleLogger();
        logger.log(person);

        logger = new JsonDecoratorLogger(logger);
        logger.log(person);
    }
}
