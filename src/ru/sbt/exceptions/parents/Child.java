package ru.sbt.exceptions.parents;

import java.io.IOException;

public class Child extends Parent {
    public Child() throws IOException {
        super("Alex");
    }
}
