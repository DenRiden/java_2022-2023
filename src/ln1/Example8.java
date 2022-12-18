package ln1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какой день недели? ");
        String name = in.nextLine();

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Какой сегодня день? ");
        int age = in.nextInt();

        System.out.println(" День недели: "+ name +" Сейчас месяц: " + month + " Сегодня: " + age + " число ");
        in.close();
    }
}
