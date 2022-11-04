import java.util.Scanner;
public class Homework6_1 {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen ters çevrilmesini istediğiniz pozitif sayıyı giriniz");
    int a = input.nextInt();
    int b = 0;
    while (a/10>0){
    if(a/10<10){
    b = (a/10) + b;
    b= b + (a%10)*10;
    a=a/10;
    }
    else if(a/10<100){
    b= b + (a%10)*100;
    a=a/10; 
  }
     else if(a/10<1000){
    b= b + (a%10)*1000;
    a=a/10; 
   }
    else if(a/10<10000){
    b= b + (a%10)*10000;
    a=a/10; 
   }
     else if(a/10<100000){
    b= b + (a%10)*100000;
    a=a/10; 
   }
     else if(a/10<1000000){
    b= b + (a%10)*1000000;
    a=a/10; 
    }
    else if(a/10<10000000){
    b= b + (a%10)*10000000;
    a=a/10; 
    }
    else if(a/10<100000000){
    b= b + (a%10)*100000000;
    a=a/10; 
    }
     else if(a/10<1000000000){
    b= b + (a%10)*1000000000;
    a=a/10; 
    }
     else if(a/10<1000000000){
    b= b + (a%10)*1000000000;
    a=a/10; 
    }
    }
   if(b<a){
       System.out.println("Yaptığınız işlemin sonucu");
       System.out.println(a);
       
   }
   else {
    System.out.println("Yaptığınız işlemin sonucu");
    System.out.println(b);
    }    
    }
}
