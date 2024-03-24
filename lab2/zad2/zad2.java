package lab2.zad2;

import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj wartość x:");
    double x = scanner.nextDouble();

    double a = obliczA(x);
    double b = obliczB(x);
    double c = obliczC(x);

    System.out.println("a(x) = " + a);
    System.out.println("b(x) = " + b);
    System.out.println("c(x) = " + c);
}

    public static double obliczA(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    public static double obliczB(double x) {
        if (x >= 1) {
            return Math.pow(x,2);
        } else {
            return x;
        }
    }

    public static double obliczC(double x) {
        if (x == 2) {
            return 8;
        } else if (x > 2){
            return 2 + x;
        }else {
            return x - 4;
        }
    }
}
