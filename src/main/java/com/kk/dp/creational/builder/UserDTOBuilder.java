package com.kk.dp.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthday(LocalDate birthday);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();
}
