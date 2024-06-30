package GS03_Threads.ThreadsTask;

public class PrinterTask implements Runnable{
    int number;

    PrinterTask(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Running " + number + " - " + Thread.currentThread().getName() );
    }
}
