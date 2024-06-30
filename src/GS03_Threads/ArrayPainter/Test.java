package GS03_Threads.ArrayPainter;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] img = new int[10][10];
        for (int[] ints : img) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
