import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if(y==0){
            return (1);
        }else{
            return (x*hitungPangkat(x,y-1));
        }
    }
    static void cetakDeretPangkat(int basis, int eksponen) {
        StringBuilder deret = new StringBuilder();
        for (int i = 0; i < eksponen; i++) {
            deret.append(basis);
            if (i < eksponen - 1) {
                deret.append("x");
            }
        }
        int hasil = (int) Math.pow(basis, eksponen);
        System.out.println( deret.toString() + " = " + hasil);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        System.out.print("Deret perhitungan pangkatnya:");
        cetakDeretPangkat(bilangan, pangkat);
    }
}
