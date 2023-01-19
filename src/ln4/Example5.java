package ln4;

import java.util.Scanner;
//import Math.random;


public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введеите число строк");
        int a = in.nextInt();
        System.out.println("Введеите число столбцов ");
        int b = in.nextInt();
        //int counter = 0;
        int rand = 0;
        //int box = 0;
        int counter = 0;
        int[][] massiv = new int[a][b];
        for (int i = 0; i<a; i++){
            for(int j=0;j<b;j++){
                rand = (int) ( Math.random() * 10);
                massiv[i][j] = rand;
                System.out.print(massiv[i][j]);
            }
            System.out.println();

        }
        System.out.println("Перевернутый массив");
        for (int i2 =0; i2<b; i2++){
            for(int j2 = 0; j2<a;j2++){
                System.out.print(massiv[j2][i2]);
            }
            System.out.println();
        }
        //System.out.println(rand);
        in.close();
    }
}
