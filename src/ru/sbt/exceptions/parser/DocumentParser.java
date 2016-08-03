package ru.sbt.exceptions.parser;

import javax.swing.text.Document;
import java.io.File;

public interface DocumentParser {
    Document parse(File file);
}
