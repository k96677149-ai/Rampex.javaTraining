package Day_7.Home_task;

import java.util.Arrays;

public class rotate_array_element {

    public static void main(String[] args) {
        int[] num = new int[]{2, 3, 4, 5, 6, 6, 7};
        int temp = 0;
        //int temp1 = 0;
        System.out.println(Arrays.toString(num));

        for (int j = 1; j <= 3; ++j) {
            for (int i = 0; i < num.length; ++i) {
                temp = num[i];
                num[i] = num[num.length - 1];
                num[num.length - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
