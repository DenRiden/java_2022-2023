package ln5;

public class Example3 {
    private int x, y;
    Example3() {

    }

    Example3(int x) {
        this.x = x;
    }

    Example3(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void description(String prefix) {
        System.out.printf("%sch:%c x:%d\n", prefix, ch, x);
    }
    public static void main(String[] args) {
        Example3 test = new Example3();
        Example3 test2 = new Example3(2);
        Example3 test3 = new Example3(6,7);
    }

}