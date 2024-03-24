package lab2.zad5;

import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Czy jest zniżka na samochód? (Tak/Nie):");
    boolean jestZnizka = scanner.nextLine().equalsIgnoreCase("Tak");

    System.out.println("Czy otrzymałeś premię? (Tak/Nie):");
    boolean otrzymalPremie = scanner.nextLine().equalsIgnoreCase("Tak");

    if (jestZnizka && otrzymalPremie) {
        System.out.println("Możesz kupić samochód !");
    }else if (!jestZnizka && !otrzymalPremie){
        System.out.println("Zakup samochód trzeba odłożyć na później...");
        System.out.println("Zniżki na samochód nie ma.");
    } else if (!jestZnizka && otrzymalPremie){
        System.out.println("Możesz kupić samochód!");
        System.out.println("Zniżki na samochód nie ma.");
        }
    else {
        System.out.println("???");
    }
    }
}
