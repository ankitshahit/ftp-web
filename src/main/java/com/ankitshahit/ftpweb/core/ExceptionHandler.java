package com.ankitshahit.ftpweb.core;

public class ExceptionHandler {

    public static String parseException(Exception ex) {
        return ex.getLocalizedMessage();
    }

    public static String parseException(ErrorMessages errorMessages) {
        return errorMessages.getUserFriendlyMsg();
    }
}
