package PracticeQuestions.Factory;

public class PepperoniFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
