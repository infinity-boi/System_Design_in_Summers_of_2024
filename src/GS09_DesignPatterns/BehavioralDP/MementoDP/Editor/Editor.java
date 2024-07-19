package GS09_DesignPatterns.BehavioralDP.MementoDP.Editor;

// The originator holds some important data that may change over time.
// It also defines a method for saving its state inside a memento and
// another method for restoring the state from it.
class Editor {
    private String text;
    private int curX, curY, selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    // Saves the current state inside a memento.
    public Snapshot createSnapshot() {
        // Memento is an immutable object; that's why the originator passes its state
        // to the memento's constructor parameters.
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }
}
