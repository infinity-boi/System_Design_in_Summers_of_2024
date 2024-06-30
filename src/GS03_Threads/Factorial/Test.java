package GS03_Threads.Factorial;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        FactorialThread t = new FactorialThread(100);
        t.start();

        System.out.println("doing some other calculation");

        t.join();
        System.out.println(t.ans);
        System.out.println("Main is runnnig!");

    }
}
