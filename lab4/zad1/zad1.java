package lab4.zad1;

import java.util.Random;
public class zad1 {
        public static void main(String[] args) {
            int[] array = generateRandomArray(10, 0, 100);
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            double average = (double) sum / array.length;
            System.out.println("Suma: " + sum);
            System.out.println("Średnia: " + average);
        }

        public static int[] generateRandomArray(int size, int min, int max) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
            return array;
        }
    }

