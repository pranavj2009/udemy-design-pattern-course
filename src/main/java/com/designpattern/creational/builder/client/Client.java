package com.designpattern.creational.builder.client;

import com.designpattern.creational.builder.dto.UserDTO;
import com.designpattern.creational.builder.dto.UserDTOBuilder;
import com.designpattern.creational.builder.dto.UserWebDTOBuilder;
import com.designpattern.creational.builder.entity.Address;
import com.designpattern.creational.builder.entity.User;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserWebDTOBuilder webDTOBuilder = new UserWebDTOBuilder();
        UserDTO dto = Client.directBuild(webDTOBuilder, user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user){
        return userDTOBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).
                withAddress(user.getAddress()).withBirthdate(user.getBirthDate()).build();
    }

    public static User createUser(){
        User user = new User();
        Address address = new Address("343, Glover street","New York", "NY","416252","US");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthDate(LocalDate.of(1990,1,1));
        user.setAddress(address);
        return user;
    }
}
