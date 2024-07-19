package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.Template;

public class DialogWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Saving the dialog state");
    }

    @Override
    protected void afterClose() {
        System.out.println("Logging dialog close event");
    }
}

