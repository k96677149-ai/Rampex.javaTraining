package Day_7.Home_task;

import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");

        for(int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }

        for(int i = size - 1; i >= 0; --i) {
            if (i == size - 1) {
                System.out.print("[" + arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }

        System.out.print("]");
    }
}
