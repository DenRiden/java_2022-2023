package ln4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i = 0;
        int j = 0;
        //int z = 0;
        for (i = 1; i <= figure; i++) {
            //System.out.print("номер строки: " + i + " ");
            //z = 0;
            for (j = -12; j < figure; j++) {
                System.out.print("+");
                //z = z + 1;
            }
            System.out.println();
            //System.out.println(" Количество символов в строке " + z);
        }

    }
}
