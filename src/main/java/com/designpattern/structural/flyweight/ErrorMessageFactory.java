package com.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    private final Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type $errorCode occured. Please refer to:\n", "http://google.com/?q="));
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not foun. An error of type $errorCode occured. Please refer to:\n",
                        "http://google.com/q="));
    }

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);


    }

    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
}
