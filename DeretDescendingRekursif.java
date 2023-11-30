import java.util.Scanner;

public class DeretDescendingRekursif {
    public static void deretIteratif(int n) {
        for (int i=n; i>=0; i--) {
            System.out.println(i);
        }
    }

    public static void deretRekursif(int n) {
        if (n<0) {
            return;
        }
        System.out.println(n);
        deretRekursif(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Bilangan dari " + n + " sampai 0 (iteratif):");
        deretIteratif(n);

        System.out.println("\nBilangan dari " + n + " sampai 0 (rekursif):");
        deretRekursif(n);
        sc.close();
    }
}
