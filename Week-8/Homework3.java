import java.util.Scanner;

public class Homework3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();
        System.out.println(kelime);
        int sayi = 0;
        char harfler[]={'a','e','i','o','u','A','E','I','U','O'};
        for (int i = 0; i<kelime.length(); i++) {
            char gecici = kelime.charAt(i);
            for (int j = 0; j < harfler.length; j++) {
                char geciciharf=harfler[j];
                if(gecici==geciciharf){
                    System.out.print(kelime.charAt(i));

                }
            }

        }
        System.out.println();
        int d = 0;
        for (int i = 0; i<kelime.length(); i++) {
            d=0;
            char gecici = kelime.charAt(i);
            for (int j = 0; j < harfler.length; j++) {
                char geciciharf=harfler[j];
                if(gecici==geciciharf){
                   d++;
                }
                }
            if (d==0){
                System.out.print(kelime.charAt(i));
            }

        }





    }
}
