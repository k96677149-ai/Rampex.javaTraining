package Day_8.Class_Task;

import java.util.Arrays;

public class arra_reverse_two_point_for {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        int left = 0;
        int right = num.length - 1;

        for(int i = 1; i <= num.length / 2; ++i) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            ++left;
            --right;
        }

        System.out.println(Arrays.toString(num));
    }
}
