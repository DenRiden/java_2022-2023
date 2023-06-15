package ln9;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter=0;
        System.out.println("Введеите число строк");
        int num= in.nextInt();
        System.out.println("Введеите число строк");
        int[] a =new int[num];

        while (counter<num) {


            try {
                a[counter] = in.nextInt();
            } catch (ArrayStoreException e) {
                System.out.println("Деление на ноль");

            }
                //    System.out.println(a[counter]);
                counter++;

        }
    }
}

