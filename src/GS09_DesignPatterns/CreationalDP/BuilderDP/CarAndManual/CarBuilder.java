package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// CarBuilder class
public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        this.car.setGPS(gps);
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}

