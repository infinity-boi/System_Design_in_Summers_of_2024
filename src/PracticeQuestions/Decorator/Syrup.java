package PracticeQuestions.Decorator;

public class Syrup extends CondimentDecorator {

    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Syrup";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.15; // Syrup costs $0.15 extra
    }
}
