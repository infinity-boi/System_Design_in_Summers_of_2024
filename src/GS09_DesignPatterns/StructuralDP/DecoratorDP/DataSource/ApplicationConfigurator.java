package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

class ApplicationConfigurator {
    private boolean enabledEncryption = true;
    private boolean enabledCompression = true;

    public void configurationExample() {
        DataSource source = new FileDataSource("salary.dat");

        if (enabledEncryption) {
            source = new EncryptionDecorator(source);
        }
        if (enabledCompression) {
            source = new CompressionDecorator(source);
        }

        SalaryManager logger = new SalaryManager(source);

        String salary = logger.load();
        System.out.println(salary);
    }
}

