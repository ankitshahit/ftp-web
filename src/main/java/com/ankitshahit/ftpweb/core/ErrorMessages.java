package com.ankitshahit.ftpweb.core;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public enum ErrorMessages {
    CLIENT_INFORMATION_MANDATORY("'Client information' is mandatory!", 1),
    CLIENT_NAME_MANDATORY("'Client name' is mandatory!", 2),
    CLIENT_EMAIL_MANDATORY("'Client email address' is mandatory!", 3),
    CLIENT_PASSWORD_MANDATORY("'Cient password' is mandatory!", 4);
    @Setter(value = AccessLevel.PRIVATE)
    @Getter
    private String msg;
    @Setter(value = AccessLevel.PRIVATE)
    @Getter
    private int code;
    @Setter(value = AccessLevel.PRIVATE)
    @Getter
    private String userFriendlyMsg;

    ErrorMessages(String msg, int code) {
        setMsg(msg);
        setCode(code);
        setUserFriendlyMsg(Utils.newStringBuilder("[code-", getCode(), ", msg-", getMsg(), "]"));
    }
}
