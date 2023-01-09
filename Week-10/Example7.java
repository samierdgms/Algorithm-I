import java.util.Scanner;
public class Example7 {
    static int sayi;

    public static void main(String[] args) {
        int sayi;
       Scanner input = new Scanner(System.in);
       int a=giris();
       System.out.println(a);


    }
    public static int giris(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lütfen 0-100 arasında sayı girişi yapınız ");
             sayi= input.nextInt();

        }while(sayi<0 || sayi>100);
        return sayi;

    }

}
