package GS09_DesignPatterns.CreationalDP.FactoryDP.ToyApp;

public class Car implements Toy{

    @Override
    public void play() {
        System.out.println("Playing with Car");
    }
}
