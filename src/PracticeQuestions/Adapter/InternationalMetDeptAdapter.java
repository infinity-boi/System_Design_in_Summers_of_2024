package PracticeQuestions.Adapter;

public class InternationalMetDeptAdapter implements WeatherService {
    private InternationalMetDept internationalMetDept;

    public InternationalMetDeptAdapter(InternationalMetDept internationalMetDept) {
        this.internationalMetDept = internationalMetDept;
    }

    @Override
    public double getTemperature() {
        return internationalMetDept.fetchTemperature();
    }

    @Override
    public double getHumidity() {
        return internationalMetDept.fetchHumidity();
    }

    @Override
    public double getWindSpeed() {
        return internationalMetDept.fetchWindSpeed();
    }
}

