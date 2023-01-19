package ln5;

import  java.util.Scanner;
public class Example2 {
    private char first;
    private char second;

    public char Vvod1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый символ");
        String text = in.nextLine();
        first = text.charAt(0);
        in.close();
        return (first);
    }

    public char Vvod2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите второй символ");
        String text2 = in.nextLine();
        second = text2.charAt(0);
        in.close();
        return (second);
    }

    public void Range() {
        for (char i = first; i <= second; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Example2 lol = new Example2();
        lol.Vvod1();
        lol.Vvod2();
        lol.Range();
    }
}