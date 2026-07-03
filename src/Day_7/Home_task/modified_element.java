package Day_7.Home_task;

import java.util.Arrays;

public class modified_element {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -5, 6, -7};

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
