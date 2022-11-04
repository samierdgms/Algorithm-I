import java.util.Scanner;
public class Homework3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int t = 0;
        while(true){
        do {
        System.out.println("Lütfen 3 ve 5 in katları şeklinde hesaplamak istediğiniz 7 den büyük sayıyı giriniz");
        a = input.nextInt();
        } while (a<7);
        for (int i = 0; t <= a; i++) {
        t=i*3;
        if(t==a){System.out.println("3*"+i+" + 5*0");
        break;
       }
       for (int j = 0; t <= a; j++) {
        t=i*3+5*j;
        if(t==a){
         System.out.println("3*"+i+" + 5*"+j);
        break;
        }
        else if (t>a){
        t=0;
        j=0;
        break;
        }
        }
        }
        } 
    }
        
    }
        
        
        
        
        
        
        
        
        
        
        
           
            
        
        
        
         
        
         
           
        
       
            
        
    

