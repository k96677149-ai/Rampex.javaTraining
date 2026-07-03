package Day_7.Class_task;

public class max {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 4};
        int max = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }

            System.out.println("max value is : " + max);
        }

    }
}
