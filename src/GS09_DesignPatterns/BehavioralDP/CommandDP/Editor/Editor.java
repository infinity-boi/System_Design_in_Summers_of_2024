package GS09_DesignPatterns.BehavioralDP.CommandDP.Editor;

// The editor class has actual text editing operations. It plays the role of a receiver: all commands end up delegating execution to the editor's methods.
class Editor {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelection() {
        // Simulate getting selected text.
        return text;
    }

    public void deleteSelection() {
        // Simulate deleting selected text.
        text = "";
    }

    public void replaceSelection(String text) {
        // Simulate replacing selected text.
        this.text = text;
    }
}
