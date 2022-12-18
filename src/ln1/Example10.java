package ln1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("В каком году родился ? ");
        int age = in.nextInt();

        age=2022-age;

        System.out.println(" Твой возраст: " + age );

        in.close();
    }
}
