package GS09_DesignPatterns.BehavioralDP.CommandDP.Editor;

import java.util.ArrayList;
import java.util.List;

// The application class sets up object relations. It acts as a sender: when something needs to be done, it creates a command object and executes it.
class Application {
    private String clipboard;
    private List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private CommandHistory history = new CommandHistory();

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setActiveEditor(Editor editor) {
        this.activeEditor = editor;
    }

    public void createUI() {
        // Dummy UI setup to demonstrate command assignment.
        Command copy = new CopyCommand(this, activeEditor);
        Command cut = new CutCommand(this, activeEditor);
        Command paste = new PasteCommand(this, activeEditor);
        Command undo = new UndoCommand(this, activeEditor);

        // Simulate button presses.
        executeCommand(copy);
        executeCommand(cut);
        executeCommand(paste);
        executeCommand(undo);
    }

    // Execute a command and check whether it has to be added to the history.
    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    // Take the most recent command from the history and run its undo method.
    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        Editor editor = new Editor();
        app.setActiveEditor(editor);
        app.createUI();

        // Test commands.
        editor.setText("Hello, World!");
        app.executeCommand(new CutCommand(app, editor));
        System.out.println("1: "+ editor.getText()); // Output: ""
        editor.setText("Hey, World!");
        System.out.println("2: "+editor.getText()); // Output: "Hey, World!"
        app.executeCommand(new PasteCommand(app, editor));
        System.out.println("3: "+editor.getText()); // Output: "Hello, World!"
        app.executeCommand(new UndoCommand(app, editor));
        System.out.println("4: "+editor.getText()); // Output: "Hey, World!"
        app.executeCommand(new UndoCommand(app, editor));
        System.out.println("5: "+editor.getText()); // Output: "Hello, World!"
        app.executeCommand(new UndoCommand(app, editor));
        System.out.println("6: "+editor.getText()); // Output: ""
    }
}
