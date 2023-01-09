import java.util.Scanner;




public class Homework2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sınır;
        System.out.println("Lütfen bir sayı giriniz");
        sınır = input.nextInt();
        asal(sınır);

    }

    public static void asal (int a) {
        int sayac = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sayac++;

            }
        }
        if (sayac == 2) {
            System.out.println("Girilen sayı asal sayıdır.");
        } else {
            System.out.println("Girilen sayı asal sayı değildir.");
        }


    }


}

