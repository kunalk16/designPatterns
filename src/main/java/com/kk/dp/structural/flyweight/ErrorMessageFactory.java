package com.kk.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
    private final Map<ErrorType, ErrorMessage> errorMessages;

    private ErrorMessageFactory() {
        this.errorMessages = new HashMap<>();
        errorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A genetic error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not found. An error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));
        errorMessages.put(ErrorType.ServerError,
                new SystemErrorMessage("Server error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));
    }

    public static ErrorMessageFactory getInstance() {
        return ErrorMessageFactoryInstanceHolder.INSTANCE;
    }

    public ErrorMessage getError(ErrorType errorType) {
        return this.errorMessages.get(errorType);
    }

    public ErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }

    private static class ErrorMessageFactoryInstanceHolder {
        private static final ErrorMessageFactory INSTANCE = new ErrorMessageFactory();
    }
}
