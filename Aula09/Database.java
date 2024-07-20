package Aula09;

public interface Database {
    void connect();
    void executeTransaction(String transaction);
}