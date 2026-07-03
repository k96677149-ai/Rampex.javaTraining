package Day_8.Class_Task;

import java.util.Arrays;

public class reverse_array_2 {

    public static void main(String[] args) {
        String[] arr = new String[]{"veg", "non-veg", "sweet"};
        String[] arr2 = new String[arr.length];
        String[] arr3 = new String[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            arr2[i] = arr[arr.length - 1 - i];
            arr3[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
