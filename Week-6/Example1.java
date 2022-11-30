import java.util.Scanner;
public class Example1 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
        do {
        System.out.println("Lütfen satır sayısını giriniz");
         a = input.nextInt();
        } while (a<0);
        int b = 0;
        for (int i = 1; i<=a ; i++) {
            
            for (int f = 1; f<=b; f++) {
              System.out.print(" ");
             }
            
            for (int c = 1; c <=a-b ; c++) {
             
             System.out.print("*");
           }
           b++;
           System.out.println("");
           
            }
            
        }
    }
    

