package GS09_DesignPatterns.StructuralDP.AdapterDP.WeatherApp;

public class IndianMetDept implements WeatherService {
    @Override
    public double getTemperature() {
        // Implementation specific to Indian Meteorological Department
        return 28.5; // Dummy temperature value
    }

    @Override
    public double getHumidity() {
        // Implementation specific to Indian Meteorological Department
        return 65.2; // Dummy humidity value
    }

    @Override
    public double getWindSpeed() {
        // Implementation specific to Indian Meteorological Department
        return 15.3; // Dummy wind speed value
    }
}
