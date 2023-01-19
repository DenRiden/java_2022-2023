package ln4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введеите число строк");
        int a = in.nextInt();
        System.out.println("Введеите число столбцов ");
        int b = in.nextInt();
        int[][] massiv = new int[a][b];
        for (int i = 0; i<a; i++){
            for(int j=0;j<b;j++){
                massiv[i][j] = 2;
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
