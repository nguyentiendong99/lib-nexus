package com.dongnguyen.libdemo.entity;

public class Client {

    private int age;

    private String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Client() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
