package GS03_Threads.AdobeLightroom;

public class DenoiseTask implements Runnable{
    String img;

    DenoiseTask(String img){
        this.img = img;
    }

    @Override
    public void run() {
        //business logic to denoise
        System.out.println("Denoise the image " + this.img + " using..   " + Thread.currentThread().getName());
    }
}