package ru.sbt.exceptions.causes;

public class Causes {
    public static void main(String[] args) {
        try {
            new NumberSummatorImpl().sum();
        } catch (Exception e) {
            throw new RuntimeException("Couldn't sum", e);
        }
    }
}