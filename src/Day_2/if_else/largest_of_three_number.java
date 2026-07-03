package Day_2.if_else;

public class largest_of_three_number {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}

