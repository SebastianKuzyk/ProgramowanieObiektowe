import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaparzystych = 0;
        int n;
        System.out.println("Podaj n");
        n = scanner.nextInt();
        System.out.print("Podaj " + n + " liczb");
        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ":" );
            int parzysta = scanner.nextInt();

    if (parzysta % 2 == 0) {
        sumaparzystych += parzysta;
    }
        }
        System.out.println("Suma parzystych = " + sumaparzystych);
    }
}
