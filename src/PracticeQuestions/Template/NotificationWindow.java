package PracticeQuestions.Template;

public class NotificationWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Sending read receipt");
    }

    @Override
    protected void afterClose() {
        System.out.println("Clearing notification from tray");
    }
}

