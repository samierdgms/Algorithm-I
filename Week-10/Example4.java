import java.util.Scanner;


public class Example4 {
    public static int a;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir A sayısı giriniz");
        a=input.nextInt();
        a=sayı(a);
        System.out.println(a);
    }
    public static int sayı (int b) {
 b++;
        System.out.println("A sayısının bir fazlası --> "+b);
        return b;



    }




}