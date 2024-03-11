import java.util.Random;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();
        int sumaparzystych = 0;
        int n;
        System.out.println("Podaj n");
        n = scanner.nextInt();
        System.out.println("wylosowane liczby:");


        for (int i = 0; i < n; i++){
            int liczba = random.nextInt(56)- 10;
            System.out.println(liczba);
            if (liczba % 2 == 0) {
                sumaparzystych += liczba;
            }
        }
        System.out.println("Suma parzystych = " + sumaparzystych);
    }
}