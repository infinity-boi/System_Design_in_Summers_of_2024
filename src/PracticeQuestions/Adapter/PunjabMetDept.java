package PracticeQuestions.Adapter;

public class PunjabMetDept implements WeatherService {
    @Override
    public double getTemperature() {
        // Implementation specific to Punjab Meteorological Department
        return 32.1; // Dummy temperature value
    }

    @Override
    public double getHumidity() {
        // Implementation specific to Punjab Meteorological Department
        return 60.8; // Dummy humidity value
    }

    @Override
    public double getWindSpeed() {
        // Implementation specific to Punjab Meteorological Department
        return 12.6; // Dummy wind speed value
    }
}

