import java.util.Scanner;
public class Homework6 {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen ters çevrilmesini istediğiniz pozitif sayıyı giriniz");
    int a = input.nextInt();
    int b = -1;
    int d = a;
    double c = 0;
    while  (d%10>0){
        b = b+1;
        d=d/10;
    }
    while (a%10>0){
    c = Math.pow(10,b)*(a%10)+c;
    b = b-1;
    a = a/10;    
    }
    System.out.println("Girdiğiniz sayının ters çevrilmiş hali");
    System.out.println(c);
    }
}
