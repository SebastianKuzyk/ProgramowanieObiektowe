import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int liczbydodatnie = 0, liczbyujemne = 0;
        int sumadodatnich = 0, sumaujemnych = 0;

        System.out.println("Podaj 10 liczb");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) +":");

            int liczba = scanner.nextInt();

        if (liczba < 0){
            liczbyujemne++;
            sumaujemnych += liczba;
        }
        if (liczba > 0){
            liczbydodatnie++;
            sumadodatnich += liczba;
            }
        }
        System.out.println("Ilosc liczb dodatnich: " + liczbydodatnie);
        System.out.println("Ilosc liczb ujemnych: " + liczbyujemne);
        System.out.println("Suma liczb dodatnich: " + sumadodatnich);
        System.out.println("Suma liczb ujemnych: " + sumaujemnych);
    }
}
