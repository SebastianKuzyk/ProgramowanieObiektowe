package lab4.zad2;

public class zad2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5};
        printEverySecondElement(array1);
        printEverySecondElement(array2);
    }

    public static void printEverySecondElement(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
