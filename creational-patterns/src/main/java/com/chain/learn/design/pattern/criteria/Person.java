package com.chain.learn.design.pattern.criteria;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 8:57 PM
 */

public class Person {

    private Long id;
    private String name;
    private Integer gender;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private Person person = new Person();

        public PersonBuilder id(Long id) {
            person.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            person.name = name;
            return this;
        }

        public PersonBuilder age(Integer age) {
            person.age = age;
            return this;
        }

        public PersonBuilder gender(Integer gender) {
            person.gender = gender;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
