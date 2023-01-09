import java.util.Scanner;
import java.util.Random;

public class Homework5 {
    public static int satır;
    public static int sutun;
    public static int asınır;
    public static int usınır;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  dizi için satır  giriniz");
        satır = input.nextInt();
        System.out.println("Lütfen  dizi için sutun giriniz");
        sutun = input.nextInt();
        System.out.println("Lütfen  dizi elemanı alt sınırı giriniz");
        asınır = input.nextInt();
        System.out.println("Lütfen  dizi elemanı üst sınırı giriniz");
        usınır = input.nextInt();
        int sayılar[][] = new int[satır][sutun];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                sayılar[i][j] = rastgele(asınır, usınır);


            }

        }

        System.out.println("Rastgele elemanlı dizi");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(sayılar[i][j]+" ");

            }

            System.out.println();
        }
        System.out.println();


    }

    public static int rastgele(int c, int d) {
        int sayı;
        Random random = new Random();
        sayı = random.nextInt(d-c) + c;


        return sayı;
    }

}






