import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();
        System.out.print("Masukkan kampus: ");
     String kampus = input.nextLine();

        System.out.println("\nNama   : " + nama);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Kampus : " + kampus);
    }
}
