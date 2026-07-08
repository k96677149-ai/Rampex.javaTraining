package Day_11.Class_task;

public class armstrong_number {

    public static void main(String[] args) {

        System.out.println(checkamstrong(154));
    }

    public static boolean checkamstrong(int num) {
        int digit = 0;
        int Originalnum = num;
        int sum = 0;
        int temp = num;
        while( temp != 0) {
            temp /= 10;
            digit++;
        }
        int rem = 0;
        temp = num;
       while(temp!=0){
            rem = temp % 10;
            sum += (int)Math.pow(sum,digit);
            temp = temp / 10;
        }


        return Originalnum == sum;
    }
}

