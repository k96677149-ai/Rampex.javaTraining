package Day_13.Class_task;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        try {
            int num = sc.nextInt();
            System.out.println(num * num);
        }
        catch(Exception e){

        }
        System.out.println("Program ended");
    }
}
