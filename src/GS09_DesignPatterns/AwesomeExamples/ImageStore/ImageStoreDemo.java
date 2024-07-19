package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class ImageStoreDemo {
    public static void main(String[] args) {
        ImageStore store = new ImageStore();
        store.store(new JPEGCompressor(),new BlackWhiteFilter(),"dogimg");
        store.store(new PNGCompressor(),new VividFilter(),"catimg");

    }
}
