package Day_8.Home_Task;

import java.util.Scanner;

public class max_and_second_max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int secondmax = 0;
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while(num > 0){
            int d = num % 10;
            if (d > max) {
                secondmax = max;
                max = d;
            } else if (d > secondmax && d != max) {
                secondmax = d;
            }
            num/=10;
        }



        System.out.println(max);
        System.out.println(secondmax);
    }
}
