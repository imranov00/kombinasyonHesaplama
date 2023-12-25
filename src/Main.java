import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        int r;


        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i girin: ");
        n = scanner.nextInt();

        System.out.print("r'yi girin: ");
        r = scanner.nextInt();

        if (r > n) {
            System.out.println("Hata: r, n'den büyük olamaz!");
        } else {
            long kombinasyon = 1;

            for (int i = 1; i <= r; i++) {
                kombinasyon *= n;
                kombinasyon /= i;
                n--;
            }

            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        }

    }
}