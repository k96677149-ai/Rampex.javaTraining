package Day_7.Class_task;

import java.util.Arrays;

public class array_1 {

        public static void main(String[] args) {
            int[] arr = new int[5];

            for (int i = 0; i <= 4; ++i) {
                arr[i] = (1 + i) * 1;
            }

            System.out.println("Array: " + Arrays.toString(arr));
        }
    }

