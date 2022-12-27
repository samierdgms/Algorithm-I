import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz");
        String kelime = input.nextLine();
        System.out.println(kelime);
        for (int i = kelime.length()-1; i>=0; i--) {
            if(i%2==0){
                System.out.print(Character.toLowerCase(kelime.charAt(i)));
            }
            else{


            System.out.print(Character.toUpperCase(kelime.charAt(i)));
        }



        }



    }
}
