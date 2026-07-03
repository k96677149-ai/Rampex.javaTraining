package Day_3.Nested_if_else;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = scanner.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.print("positive even");
            } else {
                System.out.print("positive odd");
            }
        } else if (a < 0) {
            if (a % 2 == 0) {
                System.out.print("Negative even");
            } else {
                System.out.print("Negative odd");
            }
        } else {
            System.out.print("Neutral");
        }

        scanner.close();
    }
}
