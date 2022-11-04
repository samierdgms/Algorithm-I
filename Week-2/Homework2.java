// Kullanıcıdan derece girdisi input ile  alınır ve d olarak kodlanır
// D olarak kodlanan derece 180'e bölünür ve ç olarak kodlanır
// Ç'nin yanına π yazısı println ile eklenir
// Elde edilen sonuç kullanıcıya yazdırılır
import java.util.Scanner;
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new  Scanner (System.in);
    System.out.println("Lütfen Radyana çevirmek istediğiniz dereceyi giriniz");
    double d = input.nextDouble();
    double ç = d/180 ;
    System.out.println("Girdiğiniz derecenin radyan türünden cinsi");
    System.out.println( + ç + "π");
    
        
        
        
      
        // TODO code application logic here
    }
    
}
