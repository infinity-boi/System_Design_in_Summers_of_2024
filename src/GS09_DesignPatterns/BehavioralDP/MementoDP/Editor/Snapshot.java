package GS09_DesignPatterns.BehavioralDP.MementoDP.Editor;

// The memento class stores the past state of the editor.
class Snapshot {
    private final Editor editor;
    final String text;
    private final int curX, curY, selectionWidth;

    public Snapshot(Editor editor, String text, int curX, int curY, int selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    // At some point, a previous state of the editor can be restored using a memento object.
    public void restore() {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }
}
