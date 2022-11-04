import java.util.Scanner;
public class Homework5 {

    
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çarpma operatörü kullanmadan çarpmak istediğiniz iki sayıyı giriniz");
        System.out.println("Lütfen ilk sayıyı giriniz");
        double a = input.nextDouble();
        System.out.println("Lütfen son sayıyı giriniz");
        double b = input.nextDouble();
        double t = 0;
        double c = 0;
        if (b>0){
        while(c<b){
            t=t + a;
            c= c+1;
      
        }
        }
        else if ((c>b)&& a>0){
            a = -a;
            while(c>b){
            t=t + a;
            c= c-1;
            }
           
                    
        }
         else if ((c>b)&& a<0){
          while(c>b){
            t=t + a;
            c= c-1;
            }
         }
        System.out.println("Çarpma operatörü kullanmadan çarpmak istediğiniz iki sayının çarpımı");
        System.out.println(t);
    }
    }
    
}
