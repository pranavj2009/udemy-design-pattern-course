package com.designpattern.structural.adapter;

public class BusinessCard {
    public void printCard(Customer customer){
        System.out.println("***************Card Details**********");
        System.out.println("Name:"+customer.getName());
        System.out.println("Designation:"+customer.getDesignation());
        System.out.println("Address:"+customer.getAddress());
    }
}
