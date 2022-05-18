package com.designpattern.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        SystemErrorMessage sem = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(sem.getText("4056"));

        UserBannedErrorMessage ubem = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(ubem.getText(null));
    }
}
