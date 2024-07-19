package GS09_DesignPatterns.CreationalDP.FactoryDP.PizzaDeliverySystem;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza with tomato sauce, mozzarella cheese, and assorted vegetables.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza at 350 degrees.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie Pizza into slices.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza.");
    }
}
