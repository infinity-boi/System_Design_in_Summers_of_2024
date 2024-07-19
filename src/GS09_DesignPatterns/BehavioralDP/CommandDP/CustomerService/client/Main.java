package GS09_DesignPatterns.BehavioralDP.CommandDP.CustomerService.client;

import GS09_DesignPatterns.BehavioralDP.CommandDP.CustomerService.framework.Button;
import GS09_DesignPatterns.BehavioralDP.CommandDP.CustomerService.framework.Command;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        CustomerService cs = new CustomerService();
        Command command = (Command) new AddCustomerCommand(cs);
        button.onClick(command);
    }
}
