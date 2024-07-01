package PracticeQuestions.Factory;

public class MargheritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza with tomato sauce and mozzarella cheese.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita Pizza at 350 degrees.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margherita Pizza into slices.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita Pizza.");
    }
}
