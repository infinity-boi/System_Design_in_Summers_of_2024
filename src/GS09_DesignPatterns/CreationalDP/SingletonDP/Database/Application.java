package GS09_DesignPatterns.CreationalDP.SingletonDP.Database;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users");

        // ...

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM products");

        // The variable `bar` will contain the same object as the variable `foo`.
        System.out.println(foo == bar); // This will print `true`
    }
}
