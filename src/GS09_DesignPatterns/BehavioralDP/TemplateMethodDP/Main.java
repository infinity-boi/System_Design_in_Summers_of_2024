package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP;

public class Main {
    public static void main(String[] args) {
        GenerateReportTask gt = new GenerateReportTask();
        gt.start();

        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.start();
    }
}
