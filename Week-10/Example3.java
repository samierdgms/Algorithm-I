import java.util.Scanner;


public class Example3 {
    public static int a;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir A sayısı giriniz");
        a=input.nextInt();
         deneme(a);


    }
    public static void deneme (int a) {
        a++;
        System.out.println("A sayısının bir fazlası --> "+a);



    }



}