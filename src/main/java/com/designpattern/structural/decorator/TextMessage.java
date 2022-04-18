package com.designpattern.structural.decorator;

public class TextMessage implements Message{
    private String message;

    public TextMessage(String m){
        this.message = m;
    }
    @Override
    public String getContent() {
        return message;
    }
}
