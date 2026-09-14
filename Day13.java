import java.util.Scanner;
//soal 1
public class day13{
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
      
        System.out.print("Masukkan nama: ");
        String nama = p.nextLine();
        System.out.print("Masukkan tahun lahir: ");
          int tl = p.nextInt();
        System.out.print("Masukkan tahun sekarang: ");
           int ts = p.nextInt();
       System.out.println();
 
        System.out.println("Nama: "+nama);
        System.out.println("Umur :"+ "tahun");
        System.out.println();
            p.nextLine();

        // soal 2 
        System.out.print("Nama barang: ");
        String a = p.nextLine();
        System.out.print("Harga: ");
             int b = p.nextInt();
        System.out.print("Jumlah: ");
             int c = p.nextInt();
        System.out.println();
       
         System.out.println("Barang: "+a);
        System.out.println("Harga: Rp."+b);
        System.out.println("Jumlah: "+c);
        System.out.println("Total Rp.:"+b*c);
        System.out.println();

        // soal 3 
        System.out.print("Panjang: ");
            int panjang = p.nextInt();
        System.out.print("Lebar: ");
            int lebar = p.nextInt();
            int luas = panjang * lebar;
        System.out.println("Luas : "+ luas );
    
    
    }
}
