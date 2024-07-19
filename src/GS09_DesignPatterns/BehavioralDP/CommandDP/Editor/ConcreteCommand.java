package GS09_DesignPatterns.BehavioralDP.CommandDP.Editor;

import java.util.Stack;

// The concrete commands go here.
class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.setClipboard(editor.getSelection());
        return false;
    }
}

class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}

class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard());
        return true;
    }
}

// The undo operation is also a command.
class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}

// The global command history is just a stack.
class CommandHistory {
    private Stack<Command> history = new Stack<>();

    // Last in...
    public void push(Command c) {
        history.push(c);
    }

    // ...first out
    public Command pop() {
        return history.isEmpty() ? null : history.pop();
    }
}