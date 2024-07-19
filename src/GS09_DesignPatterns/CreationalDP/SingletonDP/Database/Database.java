package GS09_DesignPatterns.CreationalDP.SingletonDP.Database;

public class Database {
    // The field for storing the singleton instance should be declared static
    private static Database instance;

    // The singleton's constructor should always be private to prevent direct construction calls with the `new` operator
    private Database() {
        // Some initialization code, such as the actual connection to a database server
        System.out.println("Database connection established.");
    }

    // The static method that controls access to the singleton instance
    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                // Ensure that the instance hasn't yet been initialized by another thread while this one has been waiting for the lock's release
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    // Any singleton should define some business logic which can be executed on its instance
    public void query(String sql) {
        // For instance, all database queries of an app go through this method.
        // Therefore, you can place throttling or caching logic here.
        System.out.println("Executing query: " + sql);
    }
}

