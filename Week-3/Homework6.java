import java.util.Scanner;
public class Homework6 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aradaki sayıların karelerini hesaplamak için iki adet sayı girişi yapınız");
        System.out.println("Lütfen ilk sayıyı giriniz");
        double a = input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        double b = input.nextDouble();
        double t = 0;
        while (a<=b)
        {
        t = t + a*a;
        a= a+1;
       }
        System.out.println("Girdiğiniz iki sayının arasındaki sayıların kareleri toplamı");
        System.out.println(t);
    }
    
}
