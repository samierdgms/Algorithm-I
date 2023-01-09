import java.util.Scanner;


public class Homework4 {
    public static int satır;
    public static int sutun;



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir satır uzunluğu  giriniz");
        satır = input.nextInt();
        System.out.println("Lütfen bir sutun uzunluğu  giriniz");
        sutun = input.nextInt();
        int sayılar[][] = new int[satır][sutun];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Lütfen dizinin " + i + " . satırı ve  " + j + " . sutun için değer giriniz");
                sayılar[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(sayılar[i][j]+" ");

            }
            System.out.println();
        }
            int sayılar2[][] = new int[satır][sutun];
            for (int i = 0; i < satır; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.println("Lütfen  ikinci dizinin " + i + " . satırı ve  " + j + " . sutun için değer giriniz");
                    sayılar2[i][j] = input.nextInt();
                }
            }
                for (int i = 0; i < satır; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print(sayılar2[i][j]+" ");

                    }
                    System.out.println();
                }
                System.out.println("İki dizinin toplamı ");
                sayılar2=topla(sayılar,sayılar2);
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(sayılar2[i][j]+" ");

            }
            System.out.println();
        }






        }




    public static int[][] topla(int[][]a, int[][] b) {
       int[][] sayılar3=new int [a.length][a[0].length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                sayılar3[i][j]=a[i][j]+b[i][j];
  }

        }





return sayılar3;
        }

    }






