package Day_7.Class_task;

public class second_max {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 50, 50};
        int max = 0;
        int Secondmax = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                Secondmax = max;
                max = arr[i];
            }
        }

        System.out.println("First max value: " + max);
        System.out.println("Second max value: " + Secondmax);
}}
