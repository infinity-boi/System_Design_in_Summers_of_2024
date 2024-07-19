package GS09_DesignPatterns.CreationalDP.BuilderDP.CarAndManual;

// Manual class
public class Manual {
    private String seatInfo;
    private String engineInfo;
    private String tripComputerInfo;
    private String gpsInfo;

    // Getters and setters
    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo;
    }

    public void setEngineInfo(String engineInfo) {
        this.engineInfo = engineInfo;
    }

    public void setTripComputerInfo(String tripComputerInfo) {
        this.tripComputerInfo = tripComputerInfo;
    }

    public void setGPSInfo(String gpsInfo) {
        this.gpsInfo = gpsInfo;
    }

    @Override
    public String toString() {
        return "Manual [seatInfo=" + seatInfo + ", engineInfo=" + engineInfo + ", tripComputerInfo=" + tripComputerInfo + ", gpsInfo=" + gpsInfo + "]";
    }
}

