package PracticeQuestions.Decorator;

//10. Decorator Design Pattern
//
//You are designing a beverage customization system for a coffee shop. The system should allow customers to create and customize their drinks by adding various ingredients such as milk, sugar, and flavor syrups. Each customization option adds a cost to the base price of the beverage. Your task is to use the Decorator design pattern to implement this system, enabling flexible and dynamic addition of ingredients to beverages.
//        Requirements:
//Beverage Interface:
//Define a common interface Beverage with methods getDescription() and getCost().
//getDescription → should all ingredients of the beverage
//cost → total cost after adding all the ingredients
//
//Concrete Beverages:
//Implement the Beverage interface for at least two types of beverages (e.g., Espresso, HouseBlend).
//Decorator Abstract Class:
//Define an abstract decorator class that implements the Beverage interface and holds a reference to a Beverage object.
//Concrete Decorators:
//Implement concrete decorators for various ingredients such as Milk, Sugar, and Syrup.
//Client Code:
//Write client code that creates beverages and dynamically adds ingredients using decorators. Display the description and cost of the final beverage.
//
//        Objectives:
//Understand the principles of the Decorator design pattern.
//Learn how to extend the behavior of objects at runtime by composing objects with decorators.
//Gain hands-on experience in implementing flexible and reusable code.


public class CoffeeShop {
    public static void main(String[] args) {
        // Order an Espresso with Milk and Sugar
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Sugar(espresso);

        System.out.println("Order: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.getCost());

        System.out.println();

        // Order a House Blend with Milk, Sugar, and Syrup
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Sugar(houseBlend);
        houseBlend = new Syrup(houseBlend);

        System.out.println("Order: " + houseBlend.getDescription());
        System.out.println("Cost: $" + houseBlend.getCost());
    }
}
