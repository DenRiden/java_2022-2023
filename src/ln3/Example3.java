package ln3;
import java.util.Scanner;
public class Example3 {
    public static void main(String [] args){
        int a = 1,b = 1,n,sum;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        in.close();
    }

}

