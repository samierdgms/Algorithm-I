import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci matris  satır ve sutün sayısı giriniz");
        System.out.println("Lütfen satır ve sütun sayısı giriniz");
        int satır = input.nextInt();
        System.out.println();
        int sayılar[][] = new int[satır][satır];
        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < satır; j++) {
                System.out.print("Lütfen  " + i + ".'ci satırın  " + j + ".sutünu için değer giriniz");
                sayılar[i][j] = input.nextInt();

            }


        }
        System.out.println();
        System.out.println("İlk matris aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < satır; k++) {
                System.out.print(sayılar[j][k] + " ");

            }
            System.out.println();

        }
        int sayılar2[] = new int[satır];
        for (int i = 0; i < satır; i++) {
            int gecici =1;
            for (int j = 0; j <satır ; j++) {
                gecici=sayılar[i][j]*gecici;

            }
            sayılar2[i]=gecici;

        }
        System.out.println("B dizisi")
        ;
        for (int i = 0; i <satır ; i++) {
            System.out.print(sayılar2[i]+" - ");


        }



    }
}













