package GS09_DesignPatterns.BehavioralDP.MementoDP.Editor;

// Main class to demonstrate the Memento pattern
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command(editor);

        // Setting initial state
        editor.setText("Initial Text");
        editor.setCursor(0, 0);
        editor.setSelectionWidth(10);

        System.out.println("Current Text: " + editor.createSnapshot().text);

        // Executing command which makes a backup before changing the state
        command.execute();

        // Changing the state of the editor
        editor.setText("Changed Text");

        System.out.println("Current Text: " + editor.createSnapshot().text);

        // Undo the last operation
        command.undo();

        System.out.println("Restored Text: " + editor.createSnapshot().text);
    }
}