import java.util.Scanner;
public class Homework2 {

     public static void main(String[] args) {
        while(true){
      Scanner input = new Scanner(System.in); 
      System.out.println("Lütfen hangi gün olduğunu öğrenmek istediğiniz bir sayıyı giriniz");
      double a = input.nextDouble();
      if (a%7==1) { System.out.println("Bu sayıya karşılık gelen gün Pazartesidir.");}
      else if (a%7==2) { System.out.println("Bu sayıya karşılık gelen gün Salıdır.");} 
      else if (a%7==3) { System.out.println("Bu sayıya karşılık gelen gün Çarşambadır.");} 
       else if (a%7==4) { System.out.println("Bu sayıya karşılık gelen gün Perşembedir.");} 
       else if (a%7==5) { System.out.println("Bu sayıya karşılık gelen gün Cumadır.");} 
       else if (a%7==6) { System.out.println("Bu sayıya karşılık gelen gün Cumartesidir.");} 
       else if (a%7==0) { System.out.println("Bu sayıya karşılık gelen gün Pazardır.");} 
       else if (a<0)  { System.out.println("Hatalı veya eksik kodlama yaptınız lütfen tekrar deneyiniz");}
      }
        }
      
          
        

    }
    

