import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lütfen kelime grubu veya cümle giriniz");
        String a = input.nextLine();
        char b;
        int c;
        for (int i = 0; i < a.length(); i++) {

            b = a.charAt(i);
            c = random.nextInt(2)  ;
            if (c % 2 == 0)
            {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            }
            else
             {
                System.out.print(Character.toUpperCase(a.charAt(i)));
            }


        }
    }
}
