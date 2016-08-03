package ru.sbt.exceptions;

public class Errors {
    public static void main(String[] args) {
        try {
            run();
        } catch (StackOverflowError e) {
        }

        q();
    }

    private static void q() {
        q();
    }

    private static void run() {
        run();
    }
}
