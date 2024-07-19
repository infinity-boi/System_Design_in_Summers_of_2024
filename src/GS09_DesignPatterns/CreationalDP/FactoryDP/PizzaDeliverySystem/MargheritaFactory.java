package GS09_DesignPatterns.CreationalDP.FactoryDP.PizzaDeliverySystem;

public class MargheritaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}


