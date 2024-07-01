package GS09_DesignPatterns.DirectionService;

public class Main {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService();
        ds.setTravelMode(new Walk());
        ds.getEta();
        ds.getDirection();
        ds.setTravelMode(new Bicycle());
        ds.getEta();
        ds.getDirection();
    }
}


