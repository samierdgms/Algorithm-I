// Kullanıcıdan işlem tercihi için input alınır
// Kullanıcıdan alınan işlem a olarak kodlanır
// Kodlanan a değerine göre işlem tercihi yapılır
// Kullanıcıdan 2 adet daha değer alınır
// Alınan 2 değer b ve c olarak kodlanır
// B ve C değerleri alınan a değerine göre işlem yapılır
// Elde edilen işlem yeniden toplama/çıkarma/çarpma/bölme olarak tekrar kodlanır
// Elde edilen toplama/çıkarma/çarpma/bölme kullanının ekranına println ile yazdırılır
import java.util.Scanner;
public class Homework7 {

    public static void main(String[] args) {
    while(true){
    Scanner input = new Scanner(System.in); 
    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
    System.out.println("Toplama için + giriniz");
    System.out.println("Çıkarma için - giriniz");
    System.out.println("Çarpma için  * giriniz");
    System.out.println("Bölme için / giriniz");
    String a = input.nextLine();
    switch (a){
        case "+":
          System.out.println("Lütfen seçtiğiniz işlem için iki sayı giriniz");
            System.out.println("Lütfen ilk sayıyı giriniz");
            double b = input.nextDouble();
            System.out.println("Lütfen ikinci sayıyı giriniz");
            double c = input.nextDouble();
            double toplama =(b+c);
            System.out.println("İşleminizin sonucu");
            System.out.println(toplama);
           
            
            break;
        case "-":
             
            System.out.println("Lütfen seçtiğiniz işlem için iki sayı giriniz");
            System.out.println("Lütfen ilk sayıyı giriniz");   
            double e = input.nextDouble();
            System.out.println("Lütfen ikinci sayıyı giriniz");
            double f = input.nextDouble();
             double çıkarma =(e-f);
            System.out.println("İşleminizin sonucu");
            System.out.println(çıkarma);
            
            
            break;
             case "*":
             System.out.println("Lütfen seçtiğiniz işlem için iki sayı giriniz");
             System.out.println("Lütfen ilk sayıyı giriniz");
             double g = input.nextDouble();
             System.out.println("Lütfen ikinci sayıyı giriniz");
             double h = input.nextDouble();
            
            double çarpma =(g*h);
            System.out.println("İşleminizin sonucu");
            System.out.println(çarpma);
           
           
            break;
            
             case "/":
            
              System.out.println("Lütfen seçtiğiniz işlem için iki sayı giriniz");
             System.out.println("Lütfen ilk sayıyı giriniz");
             double i = input.nextDouble();
             System.out.println("Lütfen ikinci sayıyı giriniz");
             double j = input.nextDouble();
             
             double bölme =(i/j);
            System.out.println("İşleminizin sonucu");
            System.out.println(bölme);
            
             
            break;
             default:
                 System.out.println("Hatalı veya eksik giriş yaptınız");
                 break;
                 
    }
    
    
    
    }
    
                 
      
    
    }
  
    
}
