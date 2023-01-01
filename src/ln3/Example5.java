package ln3;
import java.util.Scanner;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0;
        Random random = new Random();
        int x1 = x;
        while (x1 > 0) {
            int nums = random.nextInt(1000);
            if (nums % 5 == 2 || nums % 3 == 1) {
                System.out.printf("%d, ", nums);
                sum = sum + nums;
                x1--;
            }
        }
        System.out.printf("сумма чисел: %d", sum);
    }
}
