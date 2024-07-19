package GS09_DesignPatterns.StructuralDP.DecoratorDP.CoffeeShop;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20; // Milk costs $0.20 extra
    }
}
