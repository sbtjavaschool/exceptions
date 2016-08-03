package ru.sbt.exceptions.causes;

import java.io.IOException;

public class SimpleNumberSummator implements NumberSummator {
    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;

        }
        return sum;
    }
}
