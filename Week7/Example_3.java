
import java.util.Scanner;

public class Example_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen esayısı için  x değeri giriniz");
        double x = input.nextInt();
        double toplam = 0;
        
        double us;
        System.out.println();
        for (int i = 2; i <= x; i=i+2) {
        us=i-1;
        double faktoriyel = 1;
            for (int j = 1; j <=us; j++) {
                faktoriyel = faktoriyel * j ;
                
            }
            toplam=toplam+(i/faktoriyel);
            
        }
       
        System.out.println(toplam);
    }

}
