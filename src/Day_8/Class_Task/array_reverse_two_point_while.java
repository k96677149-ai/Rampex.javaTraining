package Day_8.Class_Task;

import java.util.Arrays;

public class array_reverse_two_point_while {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        int left = 0;
        int right = num.length - 1;
        //int count = 0;

        while( left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            //count++;
            ++left;
            --right;
        }

        System.out.println(Arrays.toString(num));
    }
}
