package com.quynx.microservice.usersModule.rest.users.exceptions;

public class InvalidRoleDataException extends RuntimeException {

    public InvalidRoleDataException(String message) {
        super(message);
    }

}
