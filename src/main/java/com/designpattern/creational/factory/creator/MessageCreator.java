package com.designpattern.creational.factory.creator;

import com.designpattern.creational.factory.product.Message;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();
        msg.addHeaders();
        msg.encrypt();
        return msg;
    }

    protected abstract Message createMessage();
}
