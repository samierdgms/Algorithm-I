
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kelime grubu veya cümle giriniz");
        String a = input.nextLine();
        char b;
b = 0;
        for (int i = 0; i < a.length()/2; i++) {

            if (i%2==0) {
                System.out.print(Character.toUpperCase(a.charAt(b)));
                b++;
                System.out.print(Character.toUpperCase(a.charAt(b)));
                b++;


                }
            if(a.length()%2!=0 && b==a.length()/2){
                System.out.print(Character.toUpperCase(a.charAt(b)));
                b++;

            }

            else if (i%2!=0){
                System.out.print(Character.toLowerCase(a.charAt(b)));
                b++;
                System.out.print(Character.toLowerCase(a.charAt(b)));
                b++;

            }





        }
    }
}
