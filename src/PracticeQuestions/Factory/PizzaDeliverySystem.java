package PracticeQuestions.Factory;

//8. Factory Design Pattern
//
//You are tasked with designing a system for a pizza delivery company. The company offers various types of pizzas such as Margherita, Pepperoni, and Veggie.
//
//Each type of pizza has its own unique preparation process - prepare(), bake(), cut(), box()
//and ingredients. Your goal is to implement a flexible and scalable solution for creating different types of pizzas without modifying the client code whenever a new type of pizza is introduced.
//
//
//        PizzaFactory
//SpecialFactoryClass for each type of pizza
//
//VeggieFactory.createPizza();
//
//Write a client code that use factory classes to make different type of pizzas.


public class PizzaDeliverySystem {
    public static void main(String[] args) {
        PizzaFactory margheritaFactory = new MargheritaFactory();
        PizzaFactory pepperoniFactory = new PepperoniFactory();
        PizzaFactory veggieFactory = new VeggieFactory();

        Pizza margheritaPizza = margheritaFactory.createPizza();
        margheritaPizza.prepare();
        margheritaPizza.bake();
        margheritaPizza.cut();
        margheritaPizza.box();

        System.out.println();

        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();

        System.out.println();

        Pizza veggiePizza = veggieFactory.createPizza();
        veggiePizza.prepare();
        veggiePizza.bake();
        veggiePizza.cut();
        veggiePizza.box();
    }
}

