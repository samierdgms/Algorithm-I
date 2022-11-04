import java.util.Scanner;
public class Homework1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Lütfen oluşturmak istediğiniz şekil için satır sayısı giriniz");
        int a = input.nextInt();
        for (int i = a; i > 0; i--) {
            
            for (int c = a; c > 0 ; c--) {
             
             System.out.print("*");
           }
            a--;
          System.out.println();    
            }
            
        }
    }
    

