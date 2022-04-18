package com.designpattern.creational.builder.dto;

import com.designpattern.creational.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO userDTO;

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
    public UserDTOBuilder withBirthdate(LocalDate birthdate) {
        Period period = Period.between(LocalDate.now(),birthdate);
        this.age = String.valueOf(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getStreetAddress()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry()+" "+address.getPinCode();
        return this;
    }

    @Override
    public UserDTO build() {
        return new UserWebDTO(this.firstName+" "+this.lastName, this.age, this.address);
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userDTO;
    }
}
