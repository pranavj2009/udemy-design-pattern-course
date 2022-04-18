package com.designpattern.creational.factory.product;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
