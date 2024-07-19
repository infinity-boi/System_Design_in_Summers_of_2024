package GS09_DesignPatterns.BehavioralDP.CommandDP.CustomerService.client;

import GS09_DesignPatterns.BehavioralDP.CommandDP.CustomerService.framework.Command;

public class AddCustomerCommand implements Command {
    CustomerService customerService;
    AddCustomerCommand(CustomerService cs){
        this.customerService = cs;
    }
    @Override
    public void execute() {
        //add a customer to the database
        System.out.println("Adding a customer ");
        customerService.addCustomer();
    }
}
