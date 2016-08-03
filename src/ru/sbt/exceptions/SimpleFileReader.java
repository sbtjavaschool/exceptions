package ru.sbt.exceptions;

public class SimpleFileReader {
    public String doRead() {
        try (AutoClosableImpl autoClosable = new AutoClosableImpl()) {
            System.out.println("try");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("npe");
            throw e;
        } finally {
            System.out.println("finally");
        }

//        return "";
    }


    class AutoClosableImpl implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Close");
//            throw new FileNotFoundException("message");
            throw new IllegalArgumentException();
        }
    }
}
