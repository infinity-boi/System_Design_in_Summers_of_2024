package GS03_Threads.AdobeLightroom;

public class UploadPhotosTask implements Runnable {
    public void uploadPhotos(){
        System.out.println("Uploading photos...                 " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        //businss logic
        uploadPhotos();
    }
}
