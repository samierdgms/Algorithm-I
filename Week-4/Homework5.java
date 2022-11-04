import java.util.Scanner;
public class Homework5 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen metre cinsinden bir değer giriniz")  ;
    double a = input.nextDouble();
    System.out.println("Lütfen Çevirmek istediğiniz birimi seçiniz") ;
    System.out.println("Santimetre için 1") ;
    System.out.println("Kilometre için  2") ;   
    System.out.println("Desimetre için  3") ;   
    double b = input.nextDouble();
    if( b == 1){
    a = a*100;
    }
    else if (b == 2){
    a = a/1000;
    }
    else if ( b== 3){
    a = a*10;    
    }
    System.out.println("İstediğiniz birime dönüştürülmüş hali;");
    System.out.println(a);
    }
    
}
