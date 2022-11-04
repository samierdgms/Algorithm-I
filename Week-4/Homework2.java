import java.util.Scanner;
public class Homework2 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir adet sayı girişi yapınız");
    double a = input.nextDouble();
    double g = 0;
    double b = 0;
    double d = 0;
    double c = 0;
    while(g<a) {
    g++;
    if(g%2==0 && g>=2){
    c = c + g;
    b = b + g;
    }
    else if (g%2==1 && g>=1){
    b = b + g;
    d = d + g;
    }
                }
    
  System.out.println("Girdiğiniz sayıya kadar olan sayıların toplamı");
  System.out.println(  b  );
  System.out.println("Girdiğiniz sayıya kadar olan tek sayıların toplamı");
  System.out.println(  d  );
  System.out.println("Girdiğiniz sayıya kadar olan çift sayıların toplamı"   );
  System.out.println(  c  );
   }
        
    
    

        
}


