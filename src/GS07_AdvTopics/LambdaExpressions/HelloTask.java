package GS07_AdvTopics.LambdaExpressions;

public class HelloTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from another thread!");
    }
}
