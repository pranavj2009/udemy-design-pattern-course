package com.designpattern.creational.builder.dto;

import com.designpattern.creational.builder.entity.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthdate(LocalDate birthdate);
    UserDTOBuilder withAddress(Address address);

    UserDTO build();
    UserDTO getUserDTO();
}
