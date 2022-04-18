package com.designpattern.creational.factory.product;

public abstract class Message {
    public abstract String getContent();

    public void addHeaders(){}

    public void encrypt(){}

}
