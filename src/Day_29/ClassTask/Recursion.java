package Day_29.ClassTask;

public class Recursion {
    public static void main(String[] args){
        fun(0);

    }

    public static void fun(int n){
            System.out.println("hello");
            n++;
            if(n==5){
                return;
            }
            fun(n);
            System.out.println("End");
    }
}
