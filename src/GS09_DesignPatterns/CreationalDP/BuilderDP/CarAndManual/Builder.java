package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// Builder interface
public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);
}
