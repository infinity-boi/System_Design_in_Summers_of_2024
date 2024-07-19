package GS09_DesignPatterns.BehavioralDP.StateDP.DirectionService;

public class DrivingMode implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
