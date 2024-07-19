package GS09_DesignPatterns.AwesomeExamples.Photoshop;

public class PhotoshopDemo {

    public static void main(String[] args) {
            Canvas canvas = new Canvas();
            canvas.setTool(new Select());

            canvas.onClick();
            canvas.onClickAndHold();
    }
}
