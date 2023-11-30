import java.util.Scanner;

public class CekPrimaRekursif {
    public static boolean cekPrimaRekursif(int n, int divisor) {
        if (n<=1) {
            return false;
        }
        if (divisor>n / 2) {
            return true;
        }
        if (n%divisor == 0) {
            return false; 
        } else {
            return cekPrimaRekursif(n, divisor +1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk dicek apakah prima: ");
        int n = sc.nextInt();

        boolean isPrima = cekPrimaRekursif(n, 2); 
        if (isPrima) {
            System.out.println(n +" adalah bilangan prima.");
        } else {
            System.out.println(n +" bukan bilangan prima.");
        }
        sc.close();
    }
}
