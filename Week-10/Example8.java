import java.util.Scanner;

public class Example8 {
    public static int sayi;
    public static int a;
    public static int b;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen alt sınır giriniz");
        a = input.nextInt();
        System.out.println("Lütfen üst sınır giriniz");
        b = input.nextInt();
        int dizi[]=new int [giris(a,b)];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=giris(a,b);

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");

        }











    }
    public static int giris(int a,int b){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lütfen "+a+" ve "+b+"  arasında sayı girişi yapınız ");
            sayi= input.nextInt();

        }while(sayi<a || sayi>b);
        return sayi;

    }
}
