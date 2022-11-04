import java.util.Scanner;
public class Homework2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Lütfen iki tam sayının karesi olarak yazılabildiğini kontrol etmek istediğiniz sayıyı giriniz");
        int a = input.nextInt();
        int t = 0;
        for (int i = 0; i <= a; i++) {
          for (int j = 0; j <= a; j++) {
            t=(i*i)+(j*j);
            if(t==a){System.out.println(i+"  nin karesi ve  "+j+"   nin karesi şekilinde yazılabilir");
            break;}
            }
            
             
            } 
            
             
            
             
        }
    }
        

    }
    
