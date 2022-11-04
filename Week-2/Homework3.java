// Kullanıcıdan yarıçap girdisi input olarak alınır ve y olarak kodlanır
// Kullanıcıdan alınan y değerinin küpü alınıp  4 ile çarpılır ve hacim olarak kodlanır
// Kullanıcıdan alınan y değerinin karesi alınıp 12 ile çarpılır ve alan olarak kodlanır
// Kodlanan hacim ve alan println ile kullanıcıya yazdırılır


import java.util.Scanner;
public class Homework3 {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen hacmini hesaplamak istediğiniz kürenin yarıçapını giriniz");
    double y = input.nextDouble();
    double hacim = (y*y*y * 4);
    double alan =  (y*y*12);
    System.out.println("Hesaplamak istediğiniz kürenin hacmi");
    System.out.println( + hacim );
    System.out.println("Hesaplamak istediğiniz kürenin alanı");    
    System.out.println( + alan );
        
        
        
        
        // TODO code application logic here
    }
    
}
