import java.util.Scanner;


public class Homework3 {
    public static int sınır;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir dizi uzunluğu  giriniz");
        sınır = input.nextInt();
        int sayılar[] = new int[sınır];
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("Lütfen dizinin " + i + ". elemanını giriniz");
            sayılar[i] = input.nextInt();

        }
        System.out.println("Girilen dizi");
        for (int i = 0; i < sayılar.length; i++) {
            System.out.print(sayılar[i]);

        }
        System.out.println();
        sayılar = cevir(sayılar);
        System.out.println("Dizinin çevrilmiş hali");
        for (int i = 0; i < sayılar.length; i++) {
            System.out.print(sayılar[i]);

        }


    }

    public static int[] cevir(int[] b) {
        int gecici ;
        for (int i = 0; i < b.length; i++) {
            gecici=b[i];
            for (int j = 0; j < b.length; j++) {
                if (b[j]>gecici) {
                    gecici = b[i];
                    b[i] = b[j];
                    b[j] = gecici;
                }


            }


        }
        return b;
    }


}



