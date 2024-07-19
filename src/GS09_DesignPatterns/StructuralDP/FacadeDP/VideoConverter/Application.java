package GS09_DesignPatterns.StructuralDP.FacadeDP.VideoConverter;

public class Application {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");
        mp4.save();
    }
}

