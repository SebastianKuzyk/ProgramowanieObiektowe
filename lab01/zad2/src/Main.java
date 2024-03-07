import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj 2 liczbe");
        double liczba2 = scanner.nextDouble();

        double suma = liczba1 + liczba2;
        double roznica = liczba1 - liczba2;
        double iloczyn = liczba1 * liczba2;

        System.out.println("suma:" + suma);
        System.out.println("roznica:" + roznica);
        System.out.println("iloczyn:" + iloczyn);
    }
}