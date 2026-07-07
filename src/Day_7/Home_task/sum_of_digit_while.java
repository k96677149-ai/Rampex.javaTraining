package Day_7.Home_task;

import java.util.Scanner;

public class sum_of_digit_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of digits: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            n=n/10;
        }


        System.out.println(sum);
    }
}
