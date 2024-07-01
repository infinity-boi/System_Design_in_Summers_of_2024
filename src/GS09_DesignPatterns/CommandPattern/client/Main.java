package GS09_DesignPatterns.CommandPattern.client;

import GS09_DesignPatterns.CommandPattern.framework.Button;
import GS09_DesignPatterns.CommandPattern.framework.Command;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        CustomerService cs = new CustomerService();
        Command command = (Command) new AddCustomerCommand(cs);
        button.onClick(command);
    }
}
