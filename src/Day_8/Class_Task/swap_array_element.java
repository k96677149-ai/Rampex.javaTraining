package Day_8.Class_Task;

import java.util.Arrays;

public class swap_array_element {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(num));

        for(int i = 0; i < num.length / 2; ++i) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(num));
    }
}
