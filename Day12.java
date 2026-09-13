import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama :");
        String nama = input.nextLine();

        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
       
 System.out.print("masukkan jeniskelamin : ");
String jeniskelamin = input.next();

System.out.print("masukkan alamat : ");
String alamat = input.next();
 System.out.print("masukkan jurusan :");
    String jurusan = input.next();
        
 System.out.print("masukkan hobi : ");
 String hobi = input.next();
         
        System.out.println("\n===== BIODATA =====");
        System.out.println("nama :" + nama );
        System.out.println("umur :" + umur);
        System.out.println("jeniskelamin : " + jeniskelamin);   
        System.out.println("alamat " + alamat);           System.out.println("jurusan :" + jurusan);
       System.out.println("hobi : " + hobi);
             
       System.out.println("\n====================");
        }
}
