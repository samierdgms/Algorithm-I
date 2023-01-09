import java.util.Scanner;


public class Homework1 {
    public static int sınır;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sınır  giriniz");
        sınır = input.nextInt();
        System.out.print("Yapılan işlem= ");
        sınır = topla(sınır);
        System.out.println();
        System.out.println("Sınıra kadar olan sayıların toplamı --> " + sınır);

    }

    public static int topla(int b) {
        int t = 0;
        for (int i = 0; i < b; i++) {
            System.out.print(i);

            if (i < b - 1) {
                System.out.print(" + ");
            }

            t = t + i;


        }
        return t;


    }


}