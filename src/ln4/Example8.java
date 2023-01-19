package ln4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст который нужно зашифровать: ");
        String text = in.nextLine();
        text = text.toLowerCase();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] text2 = text.toCharArray();
        int index = 0;

        char[] alp = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'а', 'б',
                'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        for (int i =0; i<text.length(); i++){
            if (text.charAt(i) == ' '){
                System.out.print(' ');
            }
            for(int j =0;j<33;j++){
                if (text.charAt(i) == alp[j]){
                    System.out.print(alp[j+key]);
                }
            }
            //System.out.print(text2[i]);
        }

        System.out.println();

        System.out.println("Выполнить обратное преобразование? (y/n): ");
        String yesno = in.nextLine();
        if (yesno == "y"){
            System.out.println("Исходный текст - " + text);
        }
        else if(yesno == "n"){
            System.out.println("До свидания!");
        }
        else{
            System.out.println("Введите корректное значиение");
        }
    }
}
