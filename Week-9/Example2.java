import java.util.Scanner;

public class Example2 {
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


        System.out.println("Lütfen  ikinci matris için satır ve sutün sayısı giriniz");
        System.out.println("Lütfen satır  sayısı giriniz");
        int satır2 = input.nextInt();
        System.out.println("Lütfen sütun  sayısı giriniz");
        int sütun2 = input.nextInt();
        int sayılar2[][] = new int[satır2][sütun2];
        for (int i = 0; i < satır2; i++) {

            for (int j = 0; j < sütun2; j++) {
                System.out.print("Lütfen ikinci matris için  " + i + ".'ci satırın  " + j + ".sutünu için değer giriniz");
                sayılar2[i][j] = input.nextInt();

            }


        }
        System.out.println();
        System.out.println("İkinci matris aşağıdaki gibidir");
        for (int j = 0; j < satır2; j++) {
            for (int k = 0; k < sütun2; k++) {
                System.out.print(sayılar2[j][k]+" ");

            }
            System.out.println();

        }
        if (sütun == satır) {
            int sayılar3[][] = new int[satır][sütun2];

            for (int i = 0; i < satır; i++) {
                for (int j = 0; j < sütun2; j++) {
                    int toplam = 0;
                    for (int k = 0; k < sütun; k++) {
                        toplam = toplam + sayılar[i][k] * sayılar2[k][j];
                    }
                    sayılar3[i][j] = toplam;


                }


            }

            System.out.println();
            System.out.println("İki matris çarpımı aşağıdaki gibidir");
            for (int j = 0; j < satır; j++) {
                for (int k = 0; k < sütun2; k++) {
                    System.out.print(sayılar3[j][k]+" ");

                }
                System.out.println();

            }


        }
        else if(sütun!=satır){
            System.out.println("Bu iki matris çarpılamaz");
        }
    }
}




