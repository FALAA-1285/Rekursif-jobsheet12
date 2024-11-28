
import java.util.Scanner;

public class Tugas1 {
    public static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n+" "); 
        deretDescendingRekursif(n - 1); 
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i); 
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n; 
        System.out.print("Masukkan nilai n: ");
        n=sc.nextInt();

        System.out.print("Menggunakan Rekursif: ");
        deretDescendingRekursif(n); 
        System.out.println();

        System.out.print("Menggunakan Iteratif: ");
        deretDescendingIteratif(n); 
    }
}