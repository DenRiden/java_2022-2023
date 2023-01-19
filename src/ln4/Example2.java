package ln4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 11; // число строк которое необходимо вывести
        int i = 0;
        int j = 0;
        int z = 0;
        for (i = 1; i <= figure; i++) {
            //System.out.print("номер строки: " + i + " ");
            for (j = z; j < figure; j++) {
                System.out.print("+");
            }
            z = z +1;
            System.out.println();

            //System.out.println(" Количество символов в строке " + z);
        }

    }
}
