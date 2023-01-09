import java.util.Scanner;

public class Example5 {
    public static double ort;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi uzunluğu giriniz");
        int a = input.nextInt();
        int sayılar[] = new int[a];
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("Dizinin " + i + "'nci elemanı için değer giriniz");
            sayılar[i] = input.nextInt();


        }
        ort = diziort(sayılar);
        System.out.println("İnt versiyonu ile dizi ortalaması --> " + ort);
        diziort2(sayılar);


    }

    public static double diziort(int sayılar2[]) {
        double ort = 0;
        for (int i = 0; i < sayılar2.length; i++) {
            ort = ort + sayılar2[i];
        }
        ort = ort / sayılar2.length;
        return (double) ort;


    }

    public static void diziort2(int sayılar2[]) {
        double ort = 0;
        for (int i = 0; i < sayılar2.length; i++) {
            ort = ort + sayılar2[i];
        }
        ort = ort / sayılar2.length;
        System.out.println("Void versiyonu ile dizi ortalaması --> " + ort);

    }
}








