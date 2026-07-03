package Day_7.Home_task;

import java.util.Scanner;

public class sum_of_digit_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of digits: ");
        int n = scanner.nextInt();
        int i = 1;

        int sum;
        for (sum = 0; n != 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println(sum);
    }
}
