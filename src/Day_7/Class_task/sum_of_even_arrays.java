package Day_7.Class_task;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_even_arrays {
    public static void main(String[] args) {
        new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i <= 4; ++i) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
