package Day_8.Home_Task;

import java.util.Scanner;

public class max_and_second_max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int secondmax = 0;
        System.out.println("Enter the number:");

        for(int num = sc.nextInt(); num != 0; num /= 10) {
            int d = num % 10;
            if (d > max) {
                secondmax = max;
                max = d;
            }
        }

        System.out.println(max);
        System.out.println(secondmax);
    }
}
