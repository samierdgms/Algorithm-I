import java.util.Scanner;
public class Homework8 {

   
    public static void main(String[] args) {
        while(true){
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bölme işlemi için pay giriniz");
    int a = input.nextInt();    
    System.out.println("Lütfen bölme işlemi için payda giriniz");
    int b = input.nextInt();  
    int c = a/b;
    int f = c;
    int l = c;
    int d = 0;
    int h = 0;
    int g = -1;
    int j = 1;
    double n = 0;

    while (f>0){
        d=d+1;
        f=f/10;
    }
    System.out.println("Girdiğiniz sayıların bölümü  " + c + "   dir ve  " + d + "  basamaklıdır lütfen sayısal değerini öğrenmek istediğiniz basamağı giriniz");
    int e = input.nextInt();
    while(h<=d && c>=1){
    h=h+1;
    g=g+1;
   
    if(e==1){
    n = Math.pow(10, g)*l%10;
    System.out.println("Seçtiğiniz basamağın değeri");   
    System.out.println(n);
    break;
    } 
    else if (h==e) {
    
    n = Math.pow(10, g)*c - c/10*Math.pow(10,g+1); 
    System.out.println("Seçtiğiniz basamağın değeri");   
    System.out.println(n);
    break;
    }
    c=c/10;
    
    } 
    }
    }
   }
 
    
    
    

