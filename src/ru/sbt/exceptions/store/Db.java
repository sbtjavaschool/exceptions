package ru.sbt.exceptions.store;

import java.sql.SQLException;

public interface Db {
    void insert(String line) throws SQLException;

    void selectAll(String line) throws SQLException;
}
