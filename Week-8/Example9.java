import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kelime grubu veya cümle giriniz");
        String kelime = input.nextLine();
        System.out.println(kelime);
        int sayi = 1;
        char aa[]={' ',',',';',':','-',};
        for (int i = 0; i<kelime.length(); i++) {
            char gecici = kelime.charAt(i);
            for (int j = 0; j < aa.length; j++) {
                char geciciharf=aa[j];
                if(gecici==geciciharf){

                    sayi++;
                }
            }

        }
        System.out.println("Toplam kelime sayısı --> "+sayi);




    }
}
