package Day_8.Home_Task;

import java.util.Arrays;
import java.util.Scanner;

public class dupilcate_remove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[5];
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the arry element:");

        for(int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j <= i; ++j) {
                if (arr[i] == arr[j] && i != j) {
                    arr2[i] = arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
