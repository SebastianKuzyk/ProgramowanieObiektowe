package lab2.zad4;

import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy pada deszcz? (Tak/Nie):");
        boolean padaDeszcz = scanner.nextLine().equalsIgnoreCase("Tak");

        System.out.println("Czy jest autobus na przystanku? (Tak/Nie):");
        boolean jestAutobus = scanner.nextLine().equalsIgnoreCase("Tak");

        if (padaDeszcz) {
            if (jestAutobus) {
                System.out.println("Weź parasol.");
                System.out.println("Dostaniesz się na uczelnię.");
            } else {
                System.out.println("Nie dostaniesz się na uczelnię.");
            }
        } else {
            if (jestAutobus) {
                System.out.println("Dostaniesz się na uczelnię.");
                System.out.println("Miłego dnia i pięknej pogody!");
            } else {
                System.out.println("Nie ma autobusu na przystanku.");
            }
        }
    }
}
