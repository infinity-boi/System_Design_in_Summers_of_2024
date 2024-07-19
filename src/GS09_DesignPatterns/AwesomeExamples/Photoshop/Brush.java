package GS09_DesignPatterns.AwesomeExamples.Photoshop;

public class Brush implements Tool{
    @Override
    public void onMouseClick() {
        System.out.println("Brush is selected");
    }

    @Override
    public void onMouseClickHold() {
        paint();
    }
    void paint(){
        System.out.println("Painting the canvas");
    }
}
