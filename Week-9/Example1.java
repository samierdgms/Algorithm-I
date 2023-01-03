import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır ve sutün sayısı giriniz");
        System.out.println("Lütfen satır  sayısı giriniz");
        int satır = input.nextInt();
        System.out.println("Lütfen sütun  sayısı giriniz");
        int sütun = input.nextInt();
        System.out.println();
        int sayılar[][] = new int[satır][sütun];
        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < sütun; j++) {
                System.out.print("Lütfen  " + i + ".'ci satırın  " + j + ".sutünu için değer giriniz");
                sayılar[i][j] = input.nextInt();

            }



        }
        System.out.println();
        System.out.println("İlk matris aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(" "+sayılar[j][k]);

            }
            System.out.println();

        }



        int sayılar2[][] = new int[satır][sütun];
        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < sütun; j++) {
                System.out.print("Lütfen ikinci matris için  " + i + ".'ci satırın  " + j + ".sutünu için değer giriniz");
                sayılar2[i][j] = input.nextInt();

            }



        }
        System.out.println();
        System.out.println("İkinci matris aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(" "+sayılar2[j][k]);

            }
            System.out.println();

        }
        int sayılar3[][]=new int [satır][sütun];
        for (int i = 0; i < satır; i++) {
        for (int j = 0; j < sütun; j++) {

                sayılar3[i][j] = sayılar[i][j]+sayılar2[i][j];

            }



        }
        System.out.println();
        System.out.println("İki matris toplamı aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(" "+sayılar3[j][k]);

            }
            System.out.println();

        }



    }
}




