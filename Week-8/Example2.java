import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();
        System.out.println("Lütfen seçmek istediğiniz harfi giriniz");
        char harf = input.nextLine().charAt(0);
          int sayac = 0;
        for (int i = 0; i <kelime.length(); i++) {
            char deneme =kelime.charAt(i);
            if (harf==deneme) {
                sayac++;
                System.out.println("Girdiğiniz harfin kelimedeki yeri -->  " +(i+1));

            }


        }
        System.out.println("Girilen harfin kelimedeki toplam sayısı --> " +sayac);



    }
}
