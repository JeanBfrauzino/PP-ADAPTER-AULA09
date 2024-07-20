package Aula09;

public class Application {
    public static void main(String[] args) {
        DatabaseAdapter freeAdapter = new DatabaseAdapter(ClientProfile.FREE);
        freeAdapter.connect();
        freeAdapter.executeTransaction("Free user transaction");

        DatabaseAdapter basicAdapter = new DatabaseAdapter(ClientProfile.BASIC);
        basicAdapter.connect();
        basicAdapter.executeTransaction("Basic user transaction");

        DatabaseAdapter ultimateAdapter = new DatabaseAdapter(ClientProfile.ULTIMATE);
        ultimateAdapter.connect();
        ultimateAdapter.executeTransaction("Ultimate user transaction");
    }
}
