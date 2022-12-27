import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();
        System.out.println(kelime);
        for (int i = kelime.length()-1; i>=0; i--) {
            System.out.print(kelime.charAt(i));


        }



    }
}
