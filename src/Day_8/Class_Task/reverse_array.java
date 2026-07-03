package Day_8.Class_Task;

import java.util.Arrays;

public class reverse_array {

    public static void main(String[] args) {
        String[] arr = new String[]{"veg", "non-veg", "sweet"};
        String[] arr2 = new String[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            arr2[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
