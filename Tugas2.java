import java.util.Scanner;

public class Tugas2 {
    public static int penjumlahanRekursif(int n, StringBuilder deret) {
        if (n == 1) {
            deret.append("1");
            return 1;
        }
        deret.append(n).append("+");
        return n + penjumlahanRekursif(n - 1, deret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f; 
        System.out.print("Masukkan bilangan: ");
        f = sc.nextInt();
        StringBuilder deret = new StringBuilder();
        int hasil = penjumlahanRekursif(f, deret);
        
        if (deret.length() > 0) {
            deret.setLength(deret.length() - 1);
        }

        System.out.println("Penjumlahan dari 1 hingga " + f + " adalah: " + deret+"1" + "=" + hasil);
    }
}
