package ln1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Твое имя: ");
        String name = in.nextLine();

        System.out.println("В каком году родился ? ");
        int age = in.nextInt();

        age=2022-age;

        System.out.printf("Имя: %s Возраст: %d  \n", name, age);

        in.close();
    }
}