package GS03_Threads.NumberPrinter;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Thread t = new Thread(new PrinterTask(i));
            t.start();
        }
    }
}
