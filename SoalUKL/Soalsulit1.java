import java.util.Scanner;
public class Soalsulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa:");
        int jumlahSiswa = scanner.nextInt();
        int[] nilai = new int[jumlahSiswa];
        int totalNilai = 0;

        System.out.println("Masukkan nilai-nilai ujian:");
        for (int i = 0; i < jumlahSiswa; i++) {
            nilai[i] = scanner.nextInt();
            totalNilai += nilai[i];
        }

        double Ratarata = (double) totalNilai / jumlahSiswa;
        System.out.println("Nilai rata-rata dari seluruh nilai adalah: " + Ratarata);
        System.out.println(" total Nilai siswa tersebut adalah " + totalNilai);
    }
}
