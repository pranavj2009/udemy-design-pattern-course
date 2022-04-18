package com.designpattern.creational.factory.client;

import com.designpattern.creational.factory.creator.JSONMessageCreator;
import com.designpattern.creational.factory.creator.MessageCreator;
import com.designpattern.creational.factory.creator.TextMessageCreator;

public class Client {
    public static void main(String[] args) {
        Client.printMessage(new TextMessageCreator());
    }


    public static void printMessage(MessageCreator creator){
        System.out.println(creator.getMessage().getContent());
    }
}
