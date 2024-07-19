package GS09_DesignPatterns.BehavioralDP.CommandDP.client;

import GS09_DesignPatterns.BehavioralDP.CommandDP.framework.Button;
import GS09_DesignPatterns.BehavioralDP.CommandDP.framework.Command;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        CustomerService cs = new CustomerService();
        Command command = (Command) new AddCustomerCommand(cs);
        button.onClick(command);
    }
}
