package ru.sbt.exceptions.parser;

public class Error {
    private final int lineNumber;
    private final int errorCode;
    private final String message;

    public Error(int lineNumber, int errorCode, String message) {
        this.lineNumber = lineNumber;
        this.errorCode = errorCode;
        this.message = message;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
