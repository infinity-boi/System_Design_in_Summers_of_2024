package PracticeQuestions.Factory;

public class VeggieFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}
