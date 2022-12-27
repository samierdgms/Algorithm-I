import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen büyük harfden oluşan cümle veya kelime giriniz");
        String kelime = input.nextLine();
        for (int i =0; i<kelime.length()/2; i++) {

            System.out.print(Character.toLowerCase(kelime.charAt(i)));
        }

        for (int i = kelime.length()-1; i>=kelime.length()/2; i--) {

                System.out.print(Character.toLowerCase(kelime.charAt(i)));
            }





        }



    }


