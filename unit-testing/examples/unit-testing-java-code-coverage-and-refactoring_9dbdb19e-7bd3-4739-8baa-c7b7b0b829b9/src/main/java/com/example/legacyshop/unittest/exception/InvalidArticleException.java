package com.example.legacyshop.unittest.exception;

public class InvalidArticleException extends RuntimeException {

    public InvalidArticleException(String message) {
        super(message);
    }
}
