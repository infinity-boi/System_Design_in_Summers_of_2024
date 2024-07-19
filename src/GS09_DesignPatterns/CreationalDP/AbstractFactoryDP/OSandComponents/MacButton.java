package GS09_DesignPatterns.CreationalDP.AbstractFactoryDP.OSandComponents;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
