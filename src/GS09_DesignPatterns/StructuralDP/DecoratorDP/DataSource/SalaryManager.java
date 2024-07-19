package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

class SalaryManager {
    private DataSource source;

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load() {
        return source.readData();
    }

    public void save(String data) {
        source.writeData(data);
    }
}
