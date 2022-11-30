
import java.util.Scanner;

public class Example_2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pi sayısı için  x değeri giriniz");
        double x = input.nextInt();
        double toplam = 0;

        double payda = 3;

        System.out.println();
        for (double k = 1; k <= x; k++) {
            double deger;
            if (k % 2 != 0) {

                deger = Math.pow(-1 * payda, -1);
            } else {

                deger = Math.pow(payda, -1);
            }
            payda = payda + 2;
            toplam = toplam + deger;
        }
        toplam = 4 * (1 + toplam);
        System.out.println(toplam);

    }

}
