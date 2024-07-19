package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// Director class
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("SUVEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
