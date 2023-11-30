public class PasanganMarmut{
    public static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan-1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args){
        int jumlahPasangan;
        System.out.println("Jumlah pasangan marmut:");
        for(int i=1; i<=12; i++){
        jumlahPasangan = hitungPasanganMarmut(i);
        System.out.println("Bulan ke-" + i + ": " + jumlahPasangan);
        }
    }
}