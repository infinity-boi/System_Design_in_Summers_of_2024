package PracticeQuestions.Command;

public class SetTextCommand implements Command {
    private VideoEditor editor;
    private String text;
    private String previousText;

    public SetTextCommand(VideoEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.setText(text);
    }

    @Override
    public void unexecute() {
        editor.setText(previousText);
    }
}
