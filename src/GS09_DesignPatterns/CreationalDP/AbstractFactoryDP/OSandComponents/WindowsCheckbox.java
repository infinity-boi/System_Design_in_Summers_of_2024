package GS09_DesignPatterns.CreationalDP.AbstractFactoryDP.OSandComponents;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
