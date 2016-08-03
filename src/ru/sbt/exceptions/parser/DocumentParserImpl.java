package ru.sbt.exceptions.parser;

import javax.swing.text.Document;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DocumentParserImpl implements DocumentParser {
    @Override
    public Document parse(File file) {
        List<String> strings = readLines();

        List<Error> errors = new ArrayList<>();


        for (int i = 0; i < errors.size(); i++) {
            int d = parse(strings.get(i), i, errors);
        }

        if (!errors.isEmpty()) {
            throw new ParserException("Errors during parse", errors);
        }

        return null;
    }

    private int parse(String string, int lineNumber, List<Error> errors) {
        int number = 0;
        try {
            number = Integer.parseInt(string);
            ;
        } catch (NumberFormatException e) {
            errors.add(new Error(lineNumber, 10, "Can't parse number"));
        }

        if (number <= 0) {
            errors.add(new Error(lineNumber, 5, "Number should be greater than 0"));
        }

        return number;
    }

    private List<String> readLines() {
        try {
            return Files.readAllLines(new File("numbers.txt").toPath());
        } catch (IOException e) {
            throw new RuntimeException("Error during reading numbers from file", e);
        }
    }
}
