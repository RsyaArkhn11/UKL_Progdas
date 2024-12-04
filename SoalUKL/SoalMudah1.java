import java.util.Scanner;
public class SoalMudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print(" Masukkan Berat Paket KG? ");
        int berat = input.nextInt();

        System.out.print(" Masukkan Jarak Pengiriman KM? ");
        int jarak = input.nextInt();

        System.out.print(" Masukkan Panjang Paket CM ?");
        int panjang = input.nextInt();

        System.out.print(" Masukkan Lebar Paket CM? ");
        int Lebar = input.nextInt();

        System.out.print(" Masukkan Tinggi Paket CM? ");
        int tinggi = input.nextInt();

        int volume = panjang * Lebar * tinggi;

        int biayaPerkg = (jarak <= 50) ? 4250 : 6000;
        int biayaPengiriman = berat * biayaPerkg;

        if (volume > 20){
            biayaPengiriman += 50000;
        }
        
        System.out.println(" Biaya Pengiriman Total Adalah = Rp "+ biayaPengiriman);
    }
}
