import java.util.Scanner;

public class Example6 {
    public static double ort;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi uzunluğu giriniz");
        int a = input.nextInt();
        int sayılar[] = new int[a];
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("Dizinin " + i + "'nci elemanı için değer giriniz");
            sayılar[i] = input.nextInt();


        }
        dizikucuk(sayılar);
        dizibuyuk(sayılar);


    }


    public static void dizikucuk(int sayılar2[]) {
        int gecicikucuksayi = sayılar2[0];
        int gecicikucukindex = 0;


        for (int k = 0; k < sayılar2.length; k++) {
            if (gecicikucuksayi >= sayılar2[k]) {
                gecicikucuksayi = sayılar2[k];
                gecicikucukindex = k;
            }

        }
        System.out.println("Dizinin en küçük sayısı --> " + gecicikucuksayi + " ve indexi --> " + gecicikucukindex);

    }

    public static void dizibuyuk(int sayılar2[]) {
        int gecicibuyuksayi = sayılar2[0];
        int gecicibuyukindex = 0;


        for (int k = 0; k < sayılar2.length; k++) {
            if (gecicibuyuksayi <= sayılar2[k]) {
                gecicibuyuksayi = sayılar2[k];
                gecicibuyukindex = k;
            }

        }
        System.out.println("Dizinin en büyük sayısı --> " + gecicibuyuksayi + " ve indexi --> " + gecicibuyukindex);

    }

}









