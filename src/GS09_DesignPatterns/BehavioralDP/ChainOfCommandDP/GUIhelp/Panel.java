package GS09_DesignPatterns.BehavioralDP.ChainOfCommandDP.GUIhelp;

// But complex components may override the default implementation.
// If the help text can't be provided in a new way, the component can always call the base implementation.
class Panel extends Container {
    private String modalHelpText;

    public Panel(int x, int y, int width, int height) {
        // Additional initialization if necessary.
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            System.out.println("Modal Help: " + modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
