package com.designpattern.creational.alternate.builder.dto;

import com.designpattern.creational.alternate.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class UserDTOBuilder{
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        public UserDTOBuilder withBirthdate(LocalDate birthdate) {
            Period period = Period.between(LocalDate.now(),birthdate);
            this.age = String.valueOf(period.getYears());
            return this;
        }


        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getStreetAddress()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry()+" "+address.getPinCode();
            return this;
        }


        public UserDTO build() {
            this.userDTO = new UserDTO();
            this.userDTO.setName(this.firstName+" "+this.lastName);
            this.userDTO.setAddress(this.address);
            this.userDTO.setAge(this.age);
            return userDTO;
        }

        public UserDTO getUserDTO(){
            return this.userDTO;
        }
    }
}
