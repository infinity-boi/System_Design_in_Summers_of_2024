package PracticeQuestions.Factory;

public class MargheritaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}


