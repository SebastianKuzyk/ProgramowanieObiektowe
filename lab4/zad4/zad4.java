package lab4.zad4;

import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }
    }
}
