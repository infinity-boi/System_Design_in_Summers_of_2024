package GS09_DesignPatterns.BehavioralDP.MementoDP.Editor;

// A command object can act as a caretaker. In that case, the command gets a memento just before it changes the originator's state.
// When undo is requested, it restores the originator's state from a memento.
class Command {
    private Snapshot backup;
    private Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup() {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restore();
        }
    }

    // Command execution logic
    public void execute() {
        makeBackup();
        // Perform some actions on the editor
        // Example: editor.setText("new text");
    }
}