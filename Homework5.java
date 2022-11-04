// Kullanıcıdan akım girdisi input olarak alınır ve a olarak kodlanır
// Kullanıcıdan direnç girdisi input olarak alınır ve d olarak kodlanır
// Kullanıcıdan alınıp kodlanan a ve d çarpılarak sonuç gerilim olarak tekrardan kodlanır
// Kullanıcıdan alınıp kodlanan gerilim println ile yazdırılır
import java.util.Scanner;
public class Homework5 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen gerilimini hesaplamak istediğiniz telin direnç ve akımını giriniz");
    System.out.println("Lütfen akımı giriniz");
    double a = input.nextDouble();
    System.out.println("Lütfen direnci giriniz");
    double d = input.nextDouble();
    double gerilim = (d*a);
    System.out.println("Hesaplamak istediğiniz telin gerilimi");
    System.out.println(+ gerilim);
    
        
        
        
        
        
    }
    
}
