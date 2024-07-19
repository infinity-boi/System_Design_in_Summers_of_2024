package GS09_DesignPatterns.BehavioralDP.MementoDP.Document;

import java.util.Stack;

public class History {
    private Stack<DocumentMemento> mementos = new Stack<>();

    public void save(Document document) {
        mementos.push(document.createMemento());
    }

    public void undo(Document document) {
        if (!mementos.isEmpty()) {
            document.restore(mementos.pop());
        }
    }
}

