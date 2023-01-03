import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci matris  satır ve sutün sayısı giriniz");
        System.out.println("Lütfen satır ve sütun sayısı giriniz");
        int satır = input.nextInt();
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
        int sayılar2[][] = new int[satır][satır];

        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < satır; j++) {
                if (i+j>=satır) {
                    sayılar2[i][j]=  sayılar[i][j];



                }


            }
        }
        System.out.println("Üçgen matris aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < satır; k++) {
                System.out.print(sayılar2[j][k] + " ");

            }
            System.out.println();


        }


    }
}