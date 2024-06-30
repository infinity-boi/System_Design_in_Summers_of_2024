package GS05_Semaphores.PC1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Queue
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAP = 5;

        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<=5;i++){
            threads.add(new Thread(new Producer(queue,MAX_CAP)));
        }

        for(int i=0; i<=3;i++){
            threads.add(new Thread(new Consumer(queue,MAX_CAP)));
        }

        for(Thread t:threads){
            t.start();
        }



    }
}
