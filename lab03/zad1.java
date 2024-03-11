import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow");
        int liczbastudentow = scanner.nextInt();

        int i = 0;
        float punkty = 0;
        while (i < liczbastudentow) {
                System.out.print("Podaj liczbę punktów studenta nr " + (i + 1) + ": ");
        float liczbapunktow = scanner.nextFloat();
        punkty += liczbapunktow;
        i++;
        }

        float srednia = punkty / liczbastudentow;
        System.out.println("\nŚrednia liczba punktów: " + srednia);
    }
}
