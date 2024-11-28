
import java.util.Scanner;

public class Tugas3 {
    public static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; 
        }
        return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int jumlahBulan; 
        System.out.print("Masukkan jumlah bulan: ");
        jumlahBulan = sc.nextInt();
        int jumlahPasangan = hitungPasangan(jumlahBulan);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + jumlahBulan + " adalah " + jumlahPasangan);
    }
}