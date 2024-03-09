package lab1.zad5;

public class zad5 {
    public static double potega(double liczba,int wykladnik) {
        return Math.pow(liczba,wykladnik);
    }
    public static void main(String[] args) {
     double liczba = 4.4;
     int wykladnik = 3;
        System.out.println(liczba + "^" + wykladnik + "=" + potega(liczba,wykladnik));
    }
}
