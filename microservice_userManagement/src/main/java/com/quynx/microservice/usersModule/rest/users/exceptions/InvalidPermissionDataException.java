package com.quynx.microservice.usersModule.rest.users.exceptions;

public class InvalidPermissionDataException extends RuntimeException {

    public InvalidPermissionDataException(String message) {
        super(message);
    }

}
