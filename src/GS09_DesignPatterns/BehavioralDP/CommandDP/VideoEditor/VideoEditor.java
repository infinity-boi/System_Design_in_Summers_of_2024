package GS09_DesignPatterns.BehavioralDP.CommandDP.VideoEditor;

public class VideoEditor {
    private float contrast = 0.5f;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void removeText() {
        this.text = "";
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
