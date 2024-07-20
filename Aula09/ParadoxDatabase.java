package Aula09;

public class ParadoxDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Paradox database...");
    }

    @Override
    public void executeTransaction(String transaction) {
        System.out.println("Executing transaction on Paradox: " + transaction);
    }
}
