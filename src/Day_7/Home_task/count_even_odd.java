package Day_7.Home_task;

public class count_even_odd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                ++count;
            } else {
                ++count1;
            }
        }

        System.out.println(count);
        System.out.println(count1);
    }
}
