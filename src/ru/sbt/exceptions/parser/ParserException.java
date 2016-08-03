package ru.sbt.exceptions.parser;

import java.util.List;

public class ParserException extends RuntimeException {
    private final List<Error> errors;

    public ParserException(String message, List<Error> errors) {
        super(message);
        this.errors = errors;
    }

    public List<Error> getErrors() {
        return errors;
    }
}