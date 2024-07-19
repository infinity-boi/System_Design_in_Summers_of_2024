package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class ImageStore {
    public void store(Compressor compressor,Filter filter,String img){
        compressor.compress(img);
        filter.apply(img);
        System.out.println("Storing the image");
    }
}
