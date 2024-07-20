package Aula09;

public class FirebirdDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Firebird database...");
    }

    @Override
    public void executeTransaction(String transaction) {
        System.out.println("Executing transaction on Firebird: " + transaction);
    }
}
