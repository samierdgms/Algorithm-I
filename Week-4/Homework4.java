import java.util.Scanner;
public class Homework4 {

    
    public static void main(String[] args) {
        while(true){
    Scanner input = new Scanner(System.in);
    System.out.println("Fonksiyonun sonucunun negatif mi pozitif mi yoksa 0 mı olduğunu öğrenmek için bir sayı giriniz") ;
    double a = input.nextDouble();
    double b = 0;
    b = a*a - 5*a + 3;
    if(b>0){
    System.out.println("Fonksiyonun sonucu pozitiftir");
    }
    else if (b<0){
    System.out.println("Fonksiyonun sonucu negatiftir");
    
    }
    else if(b==0){
    System.out.println("Fonksiyonun sonucu sıfırdır");
    }
    
    
    
    
        }
    }
    
}
