package GS09_DesignPatterns.StructuralDP.AdapterDP.LockKey;

public class Main {
    public static void main(String[] args) {
        RoundLock lock = new RoundLock(5);
        RoundKey rKey = new RoundKey(5);

        System.out.println(lock.fits(rKey)); // true

        SquareKey smallSqKey = new SquareKey(5);
        SquareKey largeSqKey = new SquareKey(10);

        // Incompatible types for hole.fits(smallSqPeg)

        SquareKeyAdapter smallSqPegAdapter = new SquareKeyAdapter(smallSqKey);
        SquareKeyAdapter largeSqPegAdapter = new SquareKeyAdapter(largeSqKey);

        System.out.println(lock.fits(smallSqPegAdapter)); // true (fits)
        System.out.println(lock.fits(largeSqPegAdapter)); // false (won't fit)
    }
}
