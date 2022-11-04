// Kullanıcıdan kilo girdisi kg cinsinden input olarak alınır ve k ile kodlanır
// Kullanıcıdan boy girdisi m cinsinden input olarak alınır ve m ile kodlanır
// Kodlanan kilo boy girdisinin karesine bölünür (k/m*m) vki olarak kodlanır
// Elde edilen vki değerlendirlir ve sonuç println ile kullanıcıya yazdırılır

import java.util.Scanner;
public class Homework6 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen VKİ hesaplamak istediğiniz kişinin kilo ve boyunu kg ve m cinsinden giriniz");
    System.out.println("Lütfen hesaplamak istediğiniz kişinin kilosunu kg cinsinden giriniz");
    double k = input.nextDouble();
    System.out.println("Lütfen hesaplamak istediğiniz kişinin boyunu m cinsinden  giriniz");
    double m = input.nextDouble();
    double vki = k/(m*m);
    System.out.println("Vücut kitle endeksiniz" );
    System.out.println( + vki);
    if(vki < 18.5){System.out.println("Olmanız gerekenden az kilodasınız yani zayıf durumundasınız.");}
    else if (18.5 <= vki && vki < 24.99){System.out.println("Normal kilonuzdasınız yani normal durumundasınız.");}
    else if (25 <= vki && vki < 29.99){System.out.println("Olmanız gerekenden fazla kilodasınız yani hafif kilolu durumundasınız.");}
    else if (30 <= vki ){System.out.println("Olmanız gerekenden  aşırı fazla kilodasınız yani obez durumundasınız.");}
        
        
        
        
        
    }
    
}
