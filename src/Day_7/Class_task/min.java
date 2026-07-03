package Day_7.Class_task;

public class min {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 1};
        int min = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min value is : " + min);
    }
}
