package GS09_DesignPatterns.BehavioralDP.CommandDP.VideoEditor;

public class SetContrastCommand implements Command {
    private VideoEditor editor;
    private float contrast;
    private float previousContrast;

    public SetContrastCommand(VideoEditor editor, float contrast) {
        this.editor = editor;
        this.contrast = contrast;
    }

    @Override
    public void execute() {
        previousContrast = editor.getContrast();
        editor.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        editor.setContrast(previousContrast);
    }
}

