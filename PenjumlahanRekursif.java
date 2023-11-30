import java.util.Scanner;

public class PenjumlahanRekursif {
    public static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if(n>1)
        System.out.print(n+" + ");
        else if(n==1)
        System.out.print(n);
        return n+penjumlahanRekursif(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();
        int hasil = penjumlahanRekursif(f);
        System.out.println(" = "+hasil);
        sc.close();
    }
}
