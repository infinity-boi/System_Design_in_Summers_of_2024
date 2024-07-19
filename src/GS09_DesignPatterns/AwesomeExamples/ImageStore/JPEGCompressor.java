package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class JPEGCompressor implements Compressor{

    @Override
    public void compress(String img) {
        System.out.println(img + "compressed using JPG Algo");
    }
}
