package GS03_Threads.Adder;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> output = executor.submit(new Adder(5, 8));
            //some work here

            System.out.println("Main is doing some work!");
            //you need the result of calculation
            System.out.println(output.get()); //blocking operation
        }
        catch(Exception IllegalArgumentException) {
            System.out.println("Error");
        }
    }
}

