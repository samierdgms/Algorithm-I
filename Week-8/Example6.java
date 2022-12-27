import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
        System.out.print(kelime.charAt(i));
        System.out.print(i+1);


        }




    }
}
