import java.util.Scanner;

public class ForKelipatan19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = scanner.nextInt();
        int banyakKelipatan = 0;
        int totalKelipatan = 0;

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah:");

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                banyakKelipatan++;
                totalKelipatan += i;
            }
        }

        System.out.println(banyakKelipatan);
        System.out.println("Total bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + totalKelipatan);
    }
}

