
import java.util.Random;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(99) + 1;
        int a;
        int c = 0;
        do {
            System.out.println("Lütfen tahmininizi giriniz");
            a = input.nextInt();
            if (a < x && a > 0 && a < 100) {
                System.out.println("lütfen daha BÜYÜK bir sayı giriniz");
            } else if (a > x && a > 0 && a < 100) {
                System.out.println("lütfen daha KÜÇÜK bir sayı giriniz");
            } else if (a < 0 || a > 100) {
                System.out.println("Lütfen 1-99 arasında bir sayı giriniz");
            }
            c++;
        } while (a != x || a < 0 || a > 100);
        System.out.println(c + " Tahminde doğru tahmin ettiniz!!");

    }

}
