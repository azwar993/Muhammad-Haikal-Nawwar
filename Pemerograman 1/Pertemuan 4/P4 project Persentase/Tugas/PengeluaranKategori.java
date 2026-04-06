import java.util.Scanner;

public class PengeluaranKategori {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGELUARAN SEMINGGU (KATEGORI) ===");

        // INPUT
        System.out.print("Masukkan total Makan: ");
        int makan = input.nextInt();

        System.out.print("Masukkan total Transport: ");
        int transport = input.nextInt();

        System.out.print("Masukkan total Belanja: ");
        int belanja = input.nextInt();

        // HITUNG TOTAL
        int total = makan + transport + belanja;

        // HITUNG PERSENTASE
        double pMakan = (makan * 100.0) / total;
        double pTransport = (transport * 100.0) / total;
        double pBelanja = (belanja * 100.0) / total;

        // OUTPUT
        System.out.println("\n==============================");
        System.out.println("Total = " + makan + " + " + transport + " + " + belanja + " = " + total);

        System.out.println("\nPersentase:");
        System.out.printf("Makan     = (%.0f / %d) x 100 = %.2f%%\n", (double)makan, total, pMakan);
        System.out.printf("Transport = (%.0f / %d) x 100 = %.2f%%\n", (double)transport, total, pTransport);
        System.out.printf("Belanja   = (%.0f / %d) x 100 = %.2f%%\n", (double)belanja, total, pBelanja);

        System.out.println("==============================");

        input.close();
    }
}