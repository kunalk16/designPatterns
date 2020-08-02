package com.kk.dp.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        UserDTO userDTO = director(new UserWebDTOBuilder(), createUser());
        System.out.println(userDTO);
    }

    private static UserDTO director(UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        Address address = new Address();
        address.setCity("Kurseong");
        address.setState("West Bengal");
        address.setZipCode("734203");
        address.setStreet("J.N.P. Road");
        address.setHouseNumber("9/1");

        User user = new User();
        user.setFirstName("Kunal");
        user.setLastName("Karmakar");
        user.setBirthday(LocalDate.of(1993, 12, 16));
        user.setAddress(address);

        return user;
    }
}
