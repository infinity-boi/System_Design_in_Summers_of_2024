package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// CarManualBuilder class
public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeatInfo("This car has " + seats + " seats.");
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngineInfo("This car has a " + engine + " engine.");
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.manual.setTripComputerInfo("Trip Computer: " + (tripComputer ? "Enabled" : "Disabled"));
    }

    @Override
    public void setGPS(boolean gps) {
        this.manual.setGPSInfo("GPS: " + (gps ? "Enabled" : "Disabled"));
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}