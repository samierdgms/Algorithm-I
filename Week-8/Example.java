import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();
        for (int i = 0; i <kelime.length(); i++) {
        System.out.println((i+1)+" 'ninci harf   --> "+kelime.charAt(i)+" ascii kodu  --> "+(int)kelime.charAt(i));

        }



    }
}
