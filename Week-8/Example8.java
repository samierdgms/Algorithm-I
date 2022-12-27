import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen büyük harfden oluşan cümle veya kelime giriniz");
        String kelime = input.nextLine();
        int j = 0;
        for (int i =0; i<kelime.length()/2; i++) {
             j = i;
             if(kelime.length()%2!=0 && i==kelime.length()/2-1)
             {
                 int a = kelime.length()/2;
                 System.out.print(Character.toLowerCase(kelime.charAt(a)));
             }
             System.out.print(Character.toLowerCase(kelime.charAt(j)));
            System.out.print(Character.toLowerCase(kelime.charAt(kelime.length()-1-j)));
 }







    }



}


