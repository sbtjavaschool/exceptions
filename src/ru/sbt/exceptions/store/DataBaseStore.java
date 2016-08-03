package ru.sbt.exceptions.store;

import java.util.List;

public class DataBaseStore implements Store {
    private final Db db;

    public DataBaseStore(Db db) {
        this.db = db;
    }

    @Override
    public void save(String t) {

    }

    @Override
    public List<String> getAll() {
        return null;
    }
}
