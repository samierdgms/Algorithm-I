import java.util.Scanner;
public class Example3 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
        do {
        System.out.println("Lütfen  tek bir satır sayısı giriniz");
         a = input.nextInt();
        } while (a<0 || a%2==0);
        
        int b = a;
        for (int i = 1; i<=a ; i++) {
            if (i==1 || i==a){
                for (int c = 0; c <= a-1; c++) {
             
             System.out.print("*");
            }
            }
            else {   
                for (int j = 1; j <= b; j++) {
                    if (j==1 || j==b) {
                    System.out.print("*");    
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            
            }
             System.out.println("");
        }
           
           
           
            
            
        }
    }
    