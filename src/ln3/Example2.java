package ln3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        num=num.toLowerCase();

        switch (num){
            case "понедельник":
                System.out.println(1);
                break;

            case "вторник":
                System.out.println(2);
                break;

            case "среда":
                System.out.println(3);
                break;

            case "четверг":
                System.out.println(4);
                break;

            case "пятница":
                System.out.println(5);
                break;

            case "суббота":
                System.out.println(6);
                break;

            case "воскресенье":
                System.out.println(7);
                break;

            default:
                System.out.println("Введенно не коректное значение");
                break;
        }
        in.close();
    }
}

