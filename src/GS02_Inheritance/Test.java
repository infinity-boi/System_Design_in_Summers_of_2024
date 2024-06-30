package GS02_Inheritance;

// Java program to illustrate the
// concept of inheritance

// driver class
public class Test {
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println("\nBefore Setting Height");
        System.out.println(mb.toString());
        mb.setHeight(10);
        System.out.println("\nAfter Setting Height");
        System.out.println(mb.toString());

    }
}
