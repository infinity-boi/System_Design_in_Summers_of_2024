package GS09_DesignPatterns.BehavioralDP.CommandDP.Editor;

// The base command class defines the common interface for all concrete commands.
abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    // Make a backup of the editor's state.
    public void saveBackup() {
        backup = editor.getText();
    }

    // Restore the editor's state.
    public void undo() {
        editor.setText(backup);
    }

    // The execution method is declared abstract to force all concrete commands to provide their own implementations.
    // The method must return true or false depending on whether the command changes the editor's state.
    public abstract boolean execute();
}