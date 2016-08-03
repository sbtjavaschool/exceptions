package ru.sbt.exceptions;

public class FinallyRecursion {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            run();
        } finally {
            run();
        }
    }
}
