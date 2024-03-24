package lab2.zad3;

public class zad3 {
    public static void main(String[] args) {
    double x = 5;
    double y = 3;
    double z = 6;

    if (x > y) {
        double temp = x;
        x = y;
        y = temp;
    }
    if (y > z) {
        double temp = y;
        y = z;
        z = temp;
    }
    if (x > y) {
        double temp = x;
        x = y;
        y = temp;
    }

    System.out.println("Posortowane liczby: " + x + ", " + y + ", " + z);
}
}
