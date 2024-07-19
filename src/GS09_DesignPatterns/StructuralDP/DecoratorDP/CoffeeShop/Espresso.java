package GS09_DesignPatterns.StructuralDP.DecoratorDP.CoffeeShop;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}

