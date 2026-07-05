package Day_13.Class_task;
import java.util.Scanner;
import java.util.*;
public class Throw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=0;
        try{
            a = sc.nextInt();
        }
        catch(Exception e){

        }
        System.out.println("got the input");

        try{if (a > 10) {


            throw new ArithmeticException();
        }
        }
        catch(Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }

        System.out.println(a);
        System.out.println("Program ended");

    }
}
