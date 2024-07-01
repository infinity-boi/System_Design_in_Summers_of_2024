package PracticeQuestions.Command;

//7. Command Pattern
//Exercise In the Exercises project, look at the command/VideoEditor class. This class represents the operations we can perform on a video, such as adding a label to it or changing its contrast. We need to allow the user to undo any changes he/she makes to a video.


public class Main {
    public static void main(String[] args) {
        VideoEditor editor = new VideoEditor();
        History history = new History();

        SetTextCommand setTextCommand = new SetTextCommand(editor, "Hello, World!");
        setTextCommand.execute();
        history.push(setTextCommand);

        SetContrastCommand setContrastCommand = new SetContrastCommand(editor, 1.0f);
        setContrastCommand.execute();
        history.push(setContrastCommand);

        System.out.println(editor);

        // Undo last command
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.unexecute();
        }

        System.out.println(editor);

        // Undo another command
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.unexecute();
        }

        System.out.println(editor);
    }
}
