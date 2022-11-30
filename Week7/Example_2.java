
import java.util.Scanner;

public class Example_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x değeri giriniz");
        double x = input.nextInt();
        double toplam = 0;
        double k1;
        double k2;
        System.out.println();
        for (double k = 0; k <= x; k++) {

            k1 = Math.pow(-1, k);
            k2 = (2 * k) + 1;
            toplam = toplam + (k1 / k2);

        }
        toplam = toplam * 4;
        System.out.println("Sonuç -->  " + toplam);

    }

}
