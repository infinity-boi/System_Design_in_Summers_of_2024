package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String img) {
        System.out.println(img + "Compressed using PNG compression");
    }
}
