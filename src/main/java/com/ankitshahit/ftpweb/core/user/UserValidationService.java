package com.ankitshahit.ftpweb.core.user;

import com.ankitshahit.ftpweb.core.Optional;

import static com.ankitshahit.ftpweb.core.ErrorMessages.*;

public class UserValidationService {
    private Client client;

    public UserValidationService(Client client) {
        this.client = client;
    }

    public UserValidationService clientInformation() {
        Optional.validationExceptionOnNull(client,
                CLIENT_INFORMATION_MANDATORY);
        return this;
    }

    public UserValidationService clientInformation(Client client) {
        Optional.validationExceptionOnNull(client,
                CLIENT_INFORMATION_MANDATORY);
        return this;
    }

    public UserValidationService clientName() {
        Optional.validationExceptionOnNull(client.getName(),
                CLIENT_NAME_MANDATORY);
        return this;
    }

    public UserValidationService clientName(Client client) {
        Optional.validationExceptionOnNull(client.getName(),
                CLIENT_NAME_MANDATORY);
        return this;
    }

    public UserValidationService clientEmail() {
        Optional.validationExceptionOnNull(client.getEmail(),
                CLIENT_EMAIL_MANDATORY);
        return this;
    }

    public UserValidationService clientEmail(Client client) {
        Optional.validationExceptionOnNull(client.getEmail(),
                CLIENT_EMAIL_MANDATORY);
        return this;
    }

    public UserValidationService clientPassword() {
        Optional.validationExceptionOnNull(client.getHash(),
                CLIENT_PASSWORD_MANDATORY);
        return this;
    }

    public UserValidationService clientPassword(Client client) {
        Optional.validationExceptionOnNull(client.getHash(),
                CLIENT_PASSWORD_MANDATORY);
        return this;
    }
}
