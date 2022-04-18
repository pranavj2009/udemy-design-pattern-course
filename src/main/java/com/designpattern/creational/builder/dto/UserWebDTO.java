package com.designpattern.creational.builder.dto;

public class UserWebDTO implements UserDTO{
    private String name;
    private String age;
    private String address;

    public UserWebDTO(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
