package com.quynx.microservice.usersModule.rest.users.exceptions;

public class InvalidRoleIdentifierException extends RuntimeException {

    public InvalidRoleIdentifierException(String message) {
        super(message);
    }

}
