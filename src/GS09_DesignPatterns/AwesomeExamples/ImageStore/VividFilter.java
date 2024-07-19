package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class VividFilter implements Filter{

    @Override
    public void apply(String img) {
        System.out.println("Applying vivid on "+img);
    }
}
