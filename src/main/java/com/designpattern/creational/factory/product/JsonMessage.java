package com.designpattern.creational.factory.product;

public class JsonMessage extends Message{
    @Override
    public String getContent() {
        return "JSON message";
    }
}
