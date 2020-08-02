package com.kk.dp.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private UserDTO userDTO;
    private String firstName;
    private String lastName;
    private String age;
    private String address;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period age = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(age.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ",\n"+
                address.getCity() + ",\n" + address.getZipCode() + ",\n" + address.getState();
        return this;
    }

    @Override
    public UserDTO build() {
        this.userDTO = new UserWebDTO(this.firstName + " " + this.lastName,
                this.address, this.age);

        return this.userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userDTO;
    }
}
