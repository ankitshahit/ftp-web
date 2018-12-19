package com.ankitshahit.ftpweb.core;

public class OperationException extends RuntimeException {
    public OperationException() {
    }

    public OperationException(String message) {
        super(message);
    }

    public OperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationException(Throwable cause) {
        super(cause);
    }

    public OperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OperationException(ErrorMessages errorMessages) {
        super(errorMessages.getUserFriendlyMsg());
    }
}
