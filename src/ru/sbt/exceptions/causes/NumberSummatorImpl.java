package ru.sbt.exceptions.causes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class NumberSummatorImpl implements NumberSummator {
    @Override
    public int sum() {
        List<String> strings = null;
        try {
            strings = Files.readAllLines(new File("numbers.txt").toPath());
        } catch (IOException e) {
            throw new RuntimeException("Error during reading numbers from file", e);
        }

        int sum = 0;
        for (String string : strings) {
            sum += Integer.parseInt(string);
        }

        return sum;
    }
}
