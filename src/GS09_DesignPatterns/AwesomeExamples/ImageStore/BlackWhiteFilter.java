package GS09_DesignPatterns.AwesomeExamples.ImageStore;

public class BlackWhiteFilter implements Filter{

    @Override
    public void apply(String img) {
        System.out.println("Applying BW filter on " +img);
    }
}
