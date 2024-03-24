package lab2.zad6;

import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Iloczyn");
        System.out.println("4. Iloraz");
        System.out.println("5. Reszta z dzielenia");

        int wybor = scanner.nextInt();

        System.out.println("Podaj dwie liczby:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double wynik;

        switch (wybor) {
            case 1:
                wynik = a + b;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = a - b;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = a * b;
                System.out.println("Wynik iloczynu: " + wynik);
                break;
            case 4:
                if (b != 0) {
                    wynik = a / b;
                    System.out.println("Wynik ilorazu: " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            case 5:
                if (b != 0) {
                    wynik = a % b;
                    System.out.println("Reszta z dzielenia: " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }
}