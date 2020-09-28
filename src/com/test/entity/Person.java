package com.test.entity;

/**
 * @author Cyistal
 * @version 1.0
 * @title
 * @date 2020/9/28+19:28
 **/
public class Person {
    private String name;
    private String address;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name + this.address + this.age + this.sex;
    }
}
