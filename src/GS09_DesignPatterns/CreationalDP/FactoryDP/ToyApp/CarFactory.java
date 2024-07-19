package GS09_DesignPatterns.CreationalDP.FactoryDP.ToyApp;

public class CarFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Car();
    }
}
