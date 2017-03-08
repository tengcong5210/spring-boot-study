package com.tcc.boot.chapter_7_2;

/**
 * Created by ibm on 2017/3/6.
 */
public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
