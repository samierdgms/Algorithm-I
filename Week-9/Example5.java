import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lütfen Sınıf notları için öğrenci ve ders sayısı  giriniz");
        System.out.println("Lütfen Öğrenci  sayısı giriniz");
        int satır = input.nextInt();
        System.out.println("Lütfen sütun  sayısı giriniz");
        int sütun = input.nextInt();
        System.out.println();
        int sayılar[][] = new int[satır][sütun];
        for (int i = 0; i < satır; i++) {

            for (int j = 0; j < sütun; j++) {
                sayılar[i][j] = random.nextInt(100);

            }


        }
        System.out.println();
        System.out.println("Notlar aşağıdaki gibidir");
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(sayılar[j][k]+" ");

            }
            System.out.println();

        }
        for (int i = 0; i < satır; i++) {
            int ortalama=0;
            for (int j = 0; j <sütun ; j++) {
                ortalama=sayılar[i][j]+ortalama;


            }
            ortalama=ortalama/sütun;
            System.out.println(i+"'.ci dersin ortalaması --> "+ortalama);

        }

        for (int i = 0; i <satır; i++) {
            int gecicikucuk=sayılar[0][0];
            int gecicibuyuk=sayılar[0][0];
            int numarasatır=0;
            int numarasütun=i;
            int numarasatırb=i;
            int numarasütunb=i;

            for (int j = 0; j < sütun; j++) {
                if(gecicikucuk>=sayılar[i][j]){
                    gecicikucuk=sayılar[i][j];
                    numarasatır=i;
                    numarasütun=j;
                }
                if(gecicibuyuk<=sayılar[i][j]){
                    gecicibuyuk=sayılar[i][j];
                    numarasatırb=i;
                    numarasütunb=j;
                }


            }
            System.out.println(i+"'ci dersin en düşük notu alan öğrenci numarası");
            System.out.print(numarasatır);
            System.out.print(numarasütun);
            System.out.println();
            System.out.println(i+"'ci dersin en yüksek notu alan öğrenci numarası");
            System.out.print(numarasatırb);
            System.out.print(numarasütunb);
            System.out.println();

        }


            }
        }















