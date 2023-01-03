import java.util.Scanner;

public class Example4 {
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
        int gecicibuyuksayı = sayılar[0][0];;
        int gecicibuyuksatır =sayılar[0][0]; ;
        int gecicibuyuksütun = sayılar[0][0];;
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                if(gecicibuyuksayı<=sayılar[i][j]){
                    gecicibuyuksayı=sayılar[i][j];
                    gecicibuyuksatır = i;
                    gecicibuyuksütun = j;

                }

            }
        }
        System.out.println();


        System.out.println("Matrisdeki en büyük sayı --> "+gecicibuyuksayı);
        System.out.println("Matrisdeki en büyük sayının satırı --> "+gecicibuyuksatır);
        System.out.println("Matrisdeki en büyük sayının sütunu --> "+gecicibuyuksütun);
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(sayılar[j][k]);
                if(gecicibuyuksatır == j-1 && gecicibuyuksütun==k-1){
                System.out.print("[");
                }
                if(gecicibuyuksatır == j && gecicibuyuksütun==k){
                    System.out.print("]");
                }

               else if(gecicibuyuksatır != j-1 && gecicibuyuksütun==k-1){
                   System.out.print(" ");
                }
              else if(gecicibuyuksatır != j && gecicibuyuksütun==k)
                System.out.print(" ");
        }




            }
            System.out.println();


        int gecicikucuksayı =  sayılar[0][0];
        int gecicikucuksatır = sayılar[0][0]; ;
        int gecicikucuksütun = sayılar[0][0];;
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                if(gecicikucuksayı>=sayılar[i][j]){
                    gecicikucuksayı=sayılar[i][j];
                    gecicikucuksatır = i;
                    gecicikucuksütun = j;

                }

            }
        }
        System.out.println("Matrisdeki en küçük sayı --> "+gecicikucuksayı);
        System.out.println("Matrisdeki en küçük sayının satırı --> "+gecicikucuksatır);
        System.out.println("Matrisdeki en küçük sayının sütunu --> "+gecicikucuksütun);
        for (int j = 0; j < satır; j++) {
            for (int k = 0; k < sütun; k++) {
                System.out.print(sayılar[j][k]+" ");
                if(gecicikucuksatır == j && gecicikucuksütun==k)
                {
                    System.out.print("<-- ");
                }

            }
            System.out.println();

        }



    }


}







