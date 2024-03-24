package lab1.zad7;

import java.util.Scanner;
public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dolną granicę przedziału:");
        int a = scanner.nextInt();
        System.out.println("Podaj górną granicę przedziału:");
        int b = scanner.nextInt();

        int num1 = a + (int)(Math.random() * ((b - a) + 1));
        int num2 = a + (int)(Math.random() * ((b - a) + 1));
        int num3 = a + (int)(Math.random() * ((b - a) + 1));

        System.out.println("Wylosowane liczby to: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Czy można zbudować trójkąt prostokątny? " + isRightTriangle(num1, num2, num3));
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;
        return max * max == sum * sum;
    }
}
