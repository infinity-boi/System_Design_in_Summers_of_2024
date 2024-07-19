package GS09_DesignPatterns.CreationalDP.AbstractFactoryDP.OSandComponents;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
