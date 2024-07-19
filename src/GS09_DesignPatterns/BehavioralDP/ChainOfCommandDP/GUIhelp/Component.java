package GS09_DesignPatterns.BehavioralDP.ChainOfCommandDP.GUIhelp;

// The base class for simple components.
abstract class Component implements ComponentWithContextualHelp {
    protected String tooltipText;

    // The component's container acts as the next link in the chain of handlers.
    protected Container container;

    // The component shows a tooltip if there's help text assigned to it.
    // Otherwise it forwards the call to the container, if it exists.
    @Override
    public void showHelp() {
        if (tooltipText != null) {
            System.out.println("Tooltip: " + tooltipText);
        } else if (container != null) {
            container.showHelp();
        }
    }
}
