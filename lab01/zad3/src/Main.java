public class Main {

    public static boolean Parzysta(int liczba)
        {
            return liczba % 2 == 0;
        }
        public static void main(String[] args) {
        int liczba = 7;
            System.out.println("Czy " + liczba + " jest parszyta = " + Parzysta(liczba));
    }
}