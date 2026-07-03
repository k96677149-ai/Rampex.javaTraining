package Day_6;

public class swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x ^= y;
        y = x ^ y;
        x ^= y;
        System.out.println(x);
        System.out.println(y);
    }
}
