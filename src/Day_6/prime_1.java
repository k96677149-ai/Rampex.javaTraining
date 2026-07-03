package Day_6;

import java.util.Scanner;

public class prime_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                ++count;
            }
        }

        if (count == 2) {
            for (int i = 1; i <= n; ++i) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}