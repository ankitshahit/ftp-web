package com.ankitshahit.ftpweb.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFactory {
    private HttpStatus httpStatus;
    private Object response;

    public static ResponseFactory okRequest(Object response) {
        return ResponseFactory.builder().httpStatus(HttpStatus.OK).response(response).build();
    }

    public static ResponseFactory badRequest(Object response) {
        return ResponseFactory.builder().httpStatus(HttpStatus.BAD_REQUEST).response(response).build();
    }

    public static ResponseFactory authenticationFailureRequest(Object response) {
        return ResponseFactory.builder().httpStatus(HttpStatus.UNAUTHORIZED)
                .response(response).build();
    }
}
