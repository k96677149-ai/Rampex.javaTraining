package Day_8.Class_Task;
import java.util.Arrays;
public class Move_0_to_RigthSideWithoutSecondArray {
    public static void main(String[] args) {

        int[] arr = {2, 0, 3, 0, 5};

        int pos = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Fill the remaining positions with 0
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }

        System.out.println(Arrays.toString(arr));
    }
}