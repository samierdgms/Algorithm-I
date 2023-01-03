import java.util.Scanner;

public class Homework6 {
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
        System.out.println("Matris aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < satır; k++) {
                System.out.print(sayılar[j][k] + " ");

            }
            System.out.println();


        }
        int sayac = 0;
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < satır; j++) {
                if (sayılar[i][j]!=sayılar[j][i]){
                    sayac++;

                }

            }

        }
        if(sayac>0){
            System.out.println("Bu matris simetrik değildir");
        }
        else {
            System.out.println("Bu matris simetrikdir");
        }

    }
}