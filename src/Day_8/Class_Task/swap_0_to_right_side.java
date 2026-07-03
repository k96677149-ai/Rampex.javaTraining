package Day_8.Class_Task;

import java.util.Arrays;

public class swap_0_to_right_side {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 3, 0, 5};
        int[] arr2 = new int[arr.length];
        int pos = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr2[pos] = arr[i];
                ++pos;
            }

            System.out.println(Arrays.toString(arr2));
        }

    }
}
