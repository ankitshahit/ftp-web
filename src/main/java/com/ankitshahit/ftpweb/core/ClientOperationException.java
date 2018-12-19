package com.ankitshahit.ftpweb.core;


public class ClientOperationException extends OperationException {

    public ClientOperationException(Exception ex) {
        super(ExceptionHandler.parseException(ex));
    }
}
