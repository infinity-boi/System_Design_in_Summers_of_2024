package GS09_DesignPatterns.CreationalDP.FactoryDP.PizzaDeliverySystem;

public class VeggieFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}
