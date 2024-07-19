package GS09_DesignPatterns.CreationalDP.FactoryDP.ToyApp;

public class DollFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new Doll();
    }
}
