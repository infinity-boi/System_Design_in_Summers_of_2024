package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP;

public class TransferMoneyTask extends Task{

    @Override
    protected void perform(){
        //business logic
        System.out.println("Transfering money");
    }
}
