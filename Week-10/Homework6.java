import java.util.Scanner;


public class Homework6 {
    public static int satır;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir satır sayısı  giriniz");
        satır = input.nextInt();
        ucgen(satır);


    }

    public static void ucgen(int b) {
        int yıldız = 1;
        int bosluk = b-1;
        for (int i = 0; i <b ; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");

                
            }
            for (int j = 0; j<yıldız; j++) {
                    System.out.print("*");


            }
            yıldız=yıldız+2;
            bosluk--;
            System.out.println();

        }




        }



    }


