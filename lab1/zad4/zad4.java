package lab1.zad4;

public class zad4 {
    public static boolean Podzielna(int liczba){
        return liczba % 3 == 0 && liczba % 5 == 0;
    }
    public static void main(String[] args) {
        int liczba = 15;
        System.out.println("Czy " + liczba + " jest podzielana przez 3 i 5? " + Podzielna(liczba));
    }
}

