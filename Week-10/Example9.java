import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static int sayi;
    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lütfen dizi uzunluğu giriniz");
        a = input.nextInt();
        System.out.println("Lütfen  dizi değerlerinin üst sınırını giriniz");
        b = input.nextInt();
        int dizi[] = new int[a];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = giris(b);

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }


    }

    public static int giris(int b) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        sayi = random.nextInt(b);
        return sayi;

    }
}
