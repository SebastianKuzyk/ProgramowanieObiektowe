package lab4.zad5;

import java.util.Arrays;
import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[8];
    for (int i = 0; i < 8; i++) {
        array[i] = scanner.nextInt();
    }
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    }
}
