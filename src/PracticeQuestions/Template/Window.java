package PracticeQuestions.Template;

public abstract class Window {
    public void close() {
        beforeClose();
        System.out.println("Removing the window from the screen");
        afterClose();
    }

    protected void beforeClose() {
        // Hook method for subclasses to override
    }

    protected void afterClose() {
        // Hook method for subclasses to override
    }
}

