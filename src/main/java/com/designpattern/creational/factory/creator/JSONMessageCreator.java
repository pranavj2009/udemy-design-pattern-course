package com.designpattern.creational.factory.creator;

import com.designpattern.creational.factory.product.JsonMessage;
import com.designpattern.creational.factory.product.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
}
