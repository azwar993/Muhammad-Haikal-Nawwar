import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.print("input kehadiran: ");
        int nilai = input.nextInt();

        System.out.print("input nilai tugas: ");
        int nilai2 = input.nextInt();

        System.out.print("input nilai uts: ");
        int nilai3 = input.nextInt();

        System.out.print("input nilai uas: ");
        int nilai4 = input.nextInt();

        int realisasi = 21;

        double bKehadiran = ((double) nilai / realisasi) * 10;
        double bTugas = nilai2 * 0.2;
        double bUts = nilai3 * 0.3;
        double bUas = nilai4 * 0.4;

        double total = bKehadiran + bTugas + bUts + bUas;

        System.out.println("=================================");
        System.out.println("Total: " + total);

        input.close();
    }
}