package Aula09;

public class DatabaseAdapter {
    private Database database;

    public DatabaseAdapter(ClientProfile profile) {
        switch (profile) {
            case FREE:
                database = new ParadoxDatabase();
                break;
            case BASIC:
                database = new FirebirdDatabase();
                break;
            case ULTIMATE:
                database = new MySQLDatabase();
                break;
        }
    }

    public void connect() {
        database.connect();
    }

    public void executeTransaction(String transaction) {
        database.executeTransaction(transaction);
    }
}
