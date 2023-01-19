package ln4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введеите число строк");
        int a = in.nextInt();
        System.out.println("Введеите число столбцов ");
        int b = in.nextInt();
        int counter = 0;
        String[][] massiv = new String[a][b];
        for (int i = 0; i<a; i++){
            for(int j=counter;j<b;j++){
                massiv[i][j] = "+";
                System.out.print(massiv[i][j]);
            }
            counter++;
            System.out.println();
        }
        in.close();
    }
}
