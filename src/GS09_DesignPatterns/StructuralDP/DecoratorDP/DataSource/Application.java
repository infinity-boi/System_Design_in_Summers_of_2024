package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

class Application {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nJane Doe,95000";

        DataSource source = new FileDataSource("salary.dat");
        source.writeData(salaryRecords);

        source = new CompressionDecorator(source);
        source.writeData(salaryRecords);

        source = new EncryptionDecorator(source);
        source.writeData(salaryRecords);
    }
}

