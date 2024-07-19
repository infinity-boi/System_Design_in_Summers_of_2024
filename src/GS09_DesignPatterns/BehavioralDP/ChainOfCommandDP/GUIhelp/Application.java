package GS09_DesignPatterns.BehavioralDP.ChainOfCommandDP.GUIhelp;

// Client code.
class Application {
    private Dialog dialog;
    private Panel panel;
    private Button ok;
    private Button cancel;

    // Every application configures the chain differently.
    public void createUI() {
        dialog = new Dialog("Budget Reports");
        dialog.setWikiPageURL("http://example.com/wiki");

        panel = new Panel(0, 0, 400, 800);
        panel.setModalHelpText("This panel does...");

        ok = new Button(250, 760, 50, 20, "OK");
        ok.tooltipText = "This is an OK button that...";

        cancel = new Button(320, 760, 50, 20, "Cancel");

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

    // Imagine what happens here.
    public void onF1KeyPress() {
        Component component = this.getComponentAtMouseCoords();
        if (component != null) {
            component.showHelp();
        }
    }

    // Dummy method to simulate getting a component at mouse coordinates.
    private Component getComponentAtMouseCoords() {
        // Return a component for demonstration purposes.
        // In a real application, this method would determine the component under the mouse cursor.
        return ok; // or cancel, or panel, etc.
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.createUI();
        app.onF1KeyPress();
    }
}
