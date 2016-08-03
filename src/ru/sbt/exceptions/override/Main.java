package ru.sbt.exceptions.override;

import java.io.IOException;

public class Main {
    private static void doCalc(Calculator calculator) {
        try {
            calculator.calc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
