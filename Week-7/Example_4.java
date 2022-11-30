
import java.util.Scanner;

public class Example_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi uzunluğu giriniz");
        int x = input.nextInt();
        System.out.println();
        int[] sayilar = new int[x];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Lütfen sayı giriniz");
            sayilar[i] = input.nextInt();

        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Dizideki elemanlar --> " + sayilar[i]);
            System.out.println();
        }
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];

        }
        System.out.println("Dizideki elemanların toplamı --> " + toplam);
        double ortalama =toplam/sayilar.length;
        System.out.println("Dizideki elemanların toplamı --> " + ortalama);

    }

}
