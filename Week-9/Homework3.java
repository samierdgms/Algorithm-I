import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci matris  satır ve sutün sayısı giriniz");
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
                System.out.print(sayılar[j][k]+" ");

            }
            System.out.println();

        }
        int toplam = 0;
        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < sütun; j++) {
                if(i<j){
                    toplam=toplam+sayılar[i][j];

                }

            }





        }
        System.out.println("Sayıların Toplamı --> "+toplam);


    }


}