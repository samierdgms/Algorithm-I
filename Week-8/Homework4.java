import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen büyük harfden oluşan cümle veya kelime giriniz");
        String kelime = input.nextLine();
        for (int i =kelime.length()/2; i>0; i--) {

            System.out.print(Character.toLowerCase(kelime.charAt(i-1)));
        }
        for (int i = kelime.length()-1; i>=kelime.length()/2; i--) {

            System.out.print(Character.toLowerCase(kelime.charAt(i)));
        }







    }



}


