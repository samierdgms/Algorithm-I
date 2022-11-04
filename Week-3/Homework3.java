import java.util.Scanner;
public class Homework3 {

    
    public static void main(String[] args) {
        while(true){
     Scanner input = new Scanner(System.in);
     System.out.println("Lütfen türünü öğrenmek istediğiniz üçgenin kenarlarını giriniz");
     System.out.println("Lütfen ilk kenarı giriniz");
     double a = input.nextDouble();
     System.out.println("Lütfen ikinci kenarı giriniz");
     double b = input.nextDouble();
     System.out.println("Lütfen son kenarı giriniz");
     double c = input.nextDouble();
     if (a!=b && a!=c &&b!=c){System.out.println("Girdiğiniz kenarlara göre üçgeniniz: Çeşitkenar üçgen");}
     else if (a==b && a==c ){System.out.println("Girdiğiniz kenarlara göre üçgeniniz: Eşkenar üçgen");}
     else if ((a==b && a!=c)||(b==c && b!=a)||(a==c && a!=b)){System.out.println("Girdiğiniz kenarlara göre üçgeniniz: İkizkenar üçgen");}
        }
        }
         
     
      
        
        
        
        
        
        
        
       
    }
    

