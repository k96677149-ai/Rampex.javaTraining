package Day_11.Class_task;

public class armstrong_number {

    public static void main(String[] args) {
        System.out.println(checkamstrong(154));
    }

    public static boolean checkamstrong(int num) {
        int digit = 0;
        int temp = num;

        int Originalnum;
        for(Originalnum = num; temp != 0; ++digit) {
            temp /= 10;
        }

        int rem = 0;

        int sum;
        for(sum = 0; num != 0; num /= 10) {
            rem = num % 10;
            sum += (int)Math.pow((double)rem, (double)digit);
        }

        System.out.println(sum);
        return Originalnum == sum;
    }
}

