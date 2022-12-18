package ln1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько тебе лет ? ");
        int age = in.nextInt();

        age=2022-age;

        System.out.println(" Твой год рождения: " + age );

        in.close();
    }
}