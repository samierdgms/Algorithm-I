import java.util.Scanner;
public class Homework4 {

    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
       while (true){
        System.out.println("Lütfen aradaki tek sayıların toplamını hesaplamak için iki adet sayı girişi yapınız");
        System.out.println("Lütfen ilk sayıyı giriniz");
        double a = input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        double b = input.nextDouble();
        double t = 0;
        if(a%2==0){
         a=a+1;
        while (a<=b)
        {
        t = t + a;
        a= a+2;
      }
        }
        else{
             while (a<=b)
        {
        t = t + a;
        a= a+2;
       
        
       }
      }
        System.out.println("Girdiğiniz iki sayının arasındaki tek sayıların  toplamı");
        System.out.println(t);
    }
       }
    
    }

