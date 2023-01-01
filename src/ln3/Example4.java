package ln3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int min = 0, max=0;

        min = Math.min(num1,num2);
        max = Math.max(num1,num2);

        while (min <= max){
            System.out.println(min);
            min++;

        }


        in.close();
    }
}

