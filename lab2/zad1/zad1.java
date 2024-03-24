package lab2.zad1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj wartość a:");
    double a = scanner.nextDouble();

    System.out.println("Podaj wartość b:");
    double b = scanner.nextDouble();

    System.out.println("Podaj wartość c:");
    double c = scanner.nextDouble();

    double delta = b * b - 4 * a * c;

    if (delta > 0) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    } else if (delta == 0) {
        double x = -b / (2 * a);
        System.out.println("Równanie ma jeden pierwiastek rzeczywisty:");
        System.out.println("x = " + x);
    } else {
        System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }
    }
}
