package Day_14.ClassTask;
import java.util.*;
public class Game {
    public static void main(String[] args){
        int rnum = (int)(10*Math.random());
        Scanner sc = new Scanner(System.in);
       System.out.println("guess the rnum????");
       int num = sc.nextInt();
       if(num == rnum){
           System.out.println("You won!!");
       }else{
           System.out.println("You lost!!" + rnum);
       }


    }
}
