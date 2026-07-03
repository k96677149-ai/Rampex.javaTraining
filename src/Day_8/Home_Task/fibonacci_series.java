package Day_8.Home_Task;

public class fibonacci_series {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i <= 10; ++i) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
}
