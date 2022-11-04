//Kullanıcıdan üçgenin kenar uzunluğu input ile alınır ve a olarak kodlanır
// Kullanıcıdan alınan kenarın yükseklik uzunluğu  inpıt ile alınır ve b olarak kodlanır
// Alınıp a ve b olarak kodlanan veriler a*b olmak üzere çarpılır ve  sonuç alan olarak yeniden kodlanır
// alan olarak kodlanan sonuç kullanıcıya yazdırılır
import java.util.Scanner;
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz "); 
     double a = input.nextDouble();
     System.out.println("Lütfen girdiğiniz kenarın yükseklik uzunluğunu giriniz "); 
     double b = input.nextDouble();
     double alan = (a * b)/2 ;
     System.out.println("İstediğiniz üçgenin alanı");
     System.out.println( + alan );
     
        
        
        
        
        // TODO code application logic here
    }
    
}
