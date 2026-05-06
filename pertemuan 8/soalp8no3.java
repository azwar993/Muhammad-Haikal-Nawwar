import java.util.Scanner;

public class soalp8no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;
        int jumlah = 0;

        do {
            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();

            total += nilai;
            jumlah++;

            System.out.print("Ingin input lagi? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        double rataRata = (double) total / jumlah;

        System.out.println("Total nilai: " + total);
        System.out.println("Jumlah data: " + jumlah);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}