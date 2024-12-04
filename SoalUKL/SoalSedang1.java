import java.util.Scanner;
public class SoalSedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Masukkan Bilangan Bulat positif : ");
        int angka = input.nextInt();

        if (angka <=0){
            System.out.println(" inputan anda salah !!! ");
        } else {
            int faktorial = 1;
        for (int i = 1; i <= angka; i++){
            faktorial *= i;
        }
        System.out.println(" Faktorial Dari " + angka + " adalah " + faktorial);
        }

        
    }
}
