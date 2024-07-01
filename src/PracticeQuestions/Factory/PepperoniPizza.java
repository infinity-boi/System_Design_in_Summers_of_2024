package PracticeQuestions.Factory;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with tomato sauce, mozzarella cheese, and pepperoni.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza at 350 degrees.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza into slices.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza.");
    }
}
