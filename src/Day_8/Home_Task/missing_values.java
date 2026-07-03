package Day_8.Home_Task;

import java.util.Arrays;
import java.util.Scanner;

public class missing_values {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the array element:");
        int[] arr = new int[size];
        int sum = 0;
        int arraysum = 0;

        for(int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
            arraysum += arr[i];
        }

        for(int i = 0; i <= num; ++i) {
            sum = num * (num + 1) / 2;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Missing Value is : " + (sum - arraysum));
    }
}
