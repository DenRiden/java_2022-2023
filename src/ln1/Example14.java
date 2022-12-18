package ln1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введеите число 1 ");
        int num1 = in.nextInt();
        int num2=0;
        int num3=0, num4=0;

        num2 = num1-1;
        num3= num1+1;
        num4=(num2+num1+num3)*(num2+num1+num3);
        System.out.println(" 1:" + num2 +"\n" + " 2:"+num1 +"\n" +" 3:" + num3 +"\n" +" 4:"+ num4);

        in.close();
    }
}