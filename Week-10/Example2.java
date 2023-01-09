
import java.util.Random;

public class Example2 {
    static int a;
    static int b;
    static int toplam;
    public static void main(String[] args) {

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