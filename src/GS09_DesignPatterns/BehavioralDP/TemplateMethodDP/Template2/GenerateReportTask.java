package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.Template2;

public class GenerateReportTask extends Task{

    @Override
    protected void perform(){
        //business logic
        System.out.println("Generating a report");
    }
}
