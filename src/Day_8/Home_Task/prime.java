package Day_8.Home_Task;

public class prime {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; ++i) {
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    count = 1;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}
