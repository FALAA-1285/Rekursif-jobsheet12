
import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(double saldoAwal, double tahun){
        if(tahun==0){
            return (saldoAwal);
        }else{
            return (1.11*hitungLaba(saldoAwal, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double saldoAwal; 
        int tahun;
        System.out.print("Masukkan saldo awal: ");
        saldoAwal=sc.nextDouble();
        System.out.print("lamanya investasi (tahun): ");
        tahun=sc.nextInt();
        System.out.print("jumlah saldo setelah "+tahun+" tahun adalah: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    
    }
}
