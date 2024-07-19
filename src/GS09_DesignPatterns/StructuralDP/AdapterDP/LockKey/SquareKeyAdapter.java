package GS09_DesignPatterns.StructuralDP.AdapterDP.LockKey;

public class SquareKeyAdapter extends RoundKey {
    private SquareKey key;

    public SquareKeyAdapter(SquareKey key) {
        this.key = key;
    }

    @Override
    public double getRadius() {
        // Adapter logic to convert width to a compatible radius
        return key.getWidth() * Math.sqrt(2) / 2;
    }
}
