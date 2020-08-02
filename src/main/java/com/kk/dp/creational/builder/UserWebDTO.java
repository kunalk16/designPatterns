package com.kk.dp.creational.builder;

public class UserWebDTO implements UserDTO {
    private final String name;
    private final String age;
    private final String address;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
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
        return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Address: " + this.address;
    }
}
