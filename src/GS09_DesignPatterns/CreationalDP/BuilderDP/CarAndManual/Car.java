package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// Car class
public class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    // Getters and setters
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
    }
}

