package Aula09;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void executeTransaction(String transaction) {
        System.out.println("Executing transaction on MySQL: " + transaction);
    }
}
