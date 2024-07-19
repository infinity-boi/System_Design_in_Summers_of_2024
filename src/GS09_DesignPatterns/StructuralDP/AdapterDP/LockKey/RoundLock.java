package GS09_DesignPatterns.StructuralDP.AdapterDP.LockKey;

public class RoundLock {
    private final double radius;

    public RoundLock(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundKey peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
