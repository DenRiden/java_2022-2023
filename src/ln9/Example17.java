package ln9;
import java.util.Scanner;
public class Example17 {


    public class ByteArraySum {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int sum_int = 0;
            while (true) {
                try {
                    Byte b = Byte.parseByte(sc.next());
                    sum_int += (int) b;
                    if (sum_int < -128 || sum_int > 127) {
                        throw new RuntimeException("Out of range");
                    }
                    System.out.println("Sum is " + (byte)sum_int);
                } catch (NumberFormatException e) {
                    System.out.println("You entered an invalid value");
                    return;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }
    }
}
