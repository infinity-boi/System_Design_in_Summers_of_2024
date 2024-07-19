package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.Template;

//6. Template Method Pattern
//In the Exercises project, look at the template/Window class. This class represents a window in a GUI framework. Application developers can use this framework to build desktop applications. The Window class has a method for closing a window. Certain windows may need to execute some code before or after a window is closed. We cannot hardcode this behavior in the Window class because the code that needs to be executed is different from one window to another. Use the template method pattern to solve this problem.

public class Main {
    public static void main(String[] args) {
        Window dialogWindow = new DialogWindow();
        dialogWindow.close();

        System.out.println();

        Window notificationWindow = new NotificationWindow();
        notificationWindow.close();
    }
}
