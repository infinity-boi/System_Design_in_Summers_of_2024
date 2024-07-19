package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// Client code
public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        // Build a sports car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();
        System.out.println(car);

        // Build a manual for the sports car
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();
        System.out.println(manual);

        // Build an SUV
        CarBuilder suvBuilder = new CarBuilder();
        director.constructSUV(suvBuilder);
        Car suv = suvBuilder.getProduct();
        System.out.println(suv);

        // Build a manual for the suv car
        CarManualBuilder suvManualBuilder = new CarManualBuilder();
        director.constructSportsCar(suvManualBuilder);
        Manual suvManual = suvManualBuilder.getProduct();
        System.out.println(suvManual);
    }
}
