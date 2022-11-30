
import java.util.Scanner;

public class Example_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x değeri giriniz");
        double x = input.nextInt();
        double toplam = 0;
        System.out.println();
        for (double k = 1; k <= x; k++) {
            double kf = 1;
            for (double i = 1; i <= k; i++) {

                kf = kf * i;

            }

            toplam = toplam + (k / kf);

        }
        System.out.println("Sonuç -->  " + toplam);

    }

}
