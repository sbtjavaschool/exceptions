package ru.sbt.exceptions.store;

import java.sql.SQLException;

public interface Db extends AutoCloseable {
    void insert(String line) throws SQLException;

    void selectAll(String line) throws SQLException;

    void close();
}
