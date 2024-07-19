package GS09_DesignPatterns.BehavioralDP.StrategyDP.Calculator;

import java.util.Scanner;

// The client code picks a concrete strategy and passes it to the context.
// The client should be aware of the differences between strategies in order to make the right choice.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the desired action (addition, subtraction, multiplication): ");
        String action = scanner.next();

        switch (action) {
            case "addition":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "subtraction":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiplication":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Unknown action!");
                scanner.close();
                return;
        }

        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("The result is: " + result);

        scanner.close();
    }
}

