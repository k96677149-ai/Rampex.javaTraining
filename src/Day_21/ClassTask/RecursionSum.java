package Day_21.ClassTask;

public class RecursionSum {
    public static void main(String[] args){
        int a = 0;
        int sum =0;
        adder(a,sum);
    }
    public static void adder(int a,int sum){
        sum += a;
        if(a==5){
            return;
        }
        a++;
        //return (adder(a,sum));
    }

}
