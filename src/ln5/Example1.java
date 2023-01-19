package ln5;
import java.util.Scanner;
public class Example1 {   private char a;
    public void vvod(char b) {
    a = b;
}

    public int Code() {
        int code = (int) a;
        return code;
    }

    public void Final() {
        System.out.printf("%c (код - %d)", a, Code());
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ что бы узнать его код");
        String text = in.nextLine();
        char textchar = text.charAt(0);
        example1.vvod(textchar);
        example1.Final();
    }
}

