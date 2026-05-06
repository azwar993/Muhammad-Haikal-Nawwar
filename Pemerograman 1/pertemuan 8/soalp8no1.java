import java.util.Scanner;

public class soalp8no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            input.nextLine(); 

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Ingin input lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); 

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
        input.close();
    }
}