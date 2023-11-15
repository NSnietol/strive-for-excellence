package com.example.legacyshop.exceptions;

public class ResourceNotFound extends  RuntimeException {
    public ResourceNotFound(String message) {
        super(message+" not found");
    }
}
