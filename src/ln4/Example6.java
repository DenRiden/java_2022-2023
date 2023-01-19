package ln4;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число строк");
        int a = in.nextInt();
        System.out.println("Введите число столбцов ");
        int b = in.nextInt();

        int rand = 0;
        int counter = 0;
        int[][] massiv = new int[a][b];
        int[][] massiv2 = new int[a][b];
        for (int i = 0; i<a; i++){
            for(int j=0;j<b;j++){
                rand = (int) ( Math.random() * 10);
                massiv[i][j] = rand;
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
        int del1 = (int)(Math.random() * a);
        int del2 = (int)(Math.random() * b);

        System.out.println("Массив с удаленными строкой - " + (del1+1) + " и стобцом- " + (del2+1));

        for (int i2 =0; i2<a; i2++){
            if (i2 == del1){

            }
            else {
                for(int j2 = 0; j2<b;j2++){
                    if (j2 == del2){

                    }
                    else {
                        System.out.print(massiv[i2][j2]);
                    }
                }
                System.out.println();
            }
            //System.out.println();
        }
        in.close();
    }
}

