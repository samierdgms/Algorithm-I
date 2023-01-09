import java.util.Scanner;
import java.util.Random;

public class Example1 {
    static int a;
    static int b;
    static int toplam;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz");
         a=input.nextInt();
        System.out.println("Lütfen bir b sayısı giriniz");
         b=input.nextInt();
        deneme(a,b);
        System.out.println();
        System.out.println("Random iki sayının toplamı");
        Random random = new Random();
        a= random.nextInt(100);
        System.out.println("Random a sayısı --> "+a);
        b= random.nextInt(100);
        System.out.println("Random b sayısı --> "+b);
        deneme(a,b);



    }
    public static void deneme (int a,int b) {
        toplam=a+b;
        System.out.println("Toplam sonuç  --> "+toplam);


    }


}