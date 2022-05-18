package com.designpattern.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {
    private String messageTemplate;

    private String helpURLBase;

    public SystemErrorMessage(String messageTemplate, String helpURLBase) {
        this.messageTemplate = messageTemplate;
        this.helpURLBase = helpURLBase;
    }

    @Override
    public String getText(String errorCode) {
        return messageTemplate.replace("$errorCode", errorCode) + helpURLBase + errorCode;
    }
}
