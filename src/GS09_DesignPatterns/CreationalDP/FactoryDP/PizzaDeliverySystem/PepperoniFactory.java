package GS09_DesignPatterns.CreationalDP.FactoryDP.PizzaDeliverySystem;

public class PepperoniFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
