package com.designpattern.creational.factory.creator;

import com.designpattern.creational.factory.product.Message;
import com.designpattern.creational.factory.product.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
