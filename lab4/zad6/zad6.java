package lab4.zad6;

import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    for (int i = 0; i < 5; i++) {
        array[i] = scanner.nextInt();
    }
    for (int num : array) {
        System.out.println(factorial(num));
    }
}

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
