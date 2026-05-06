import java.util.Scanner;

public class soalp8no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;

        do {
            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();
            input.nextLine(); 

            total += nilai;

            System.out.print("Ingin input lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); 

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total nilai: " + total);
        input.close();
    }
}