package Day_17.Hometask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the element:");
        int[] num = new int[4];
        ArrayList<Integer> n = new ArrayList<>();
//        int index = 0;
//        for(int i:num){
//            num[index++] = sc.nextInt();
//        }
        for(int i=0;i<4;i++){
             num[i] = sc.nextInt();
        }
        for(int i:num){
            n.add(i);
        }
//        n.add(78);
//        n.add(90);
//        n.add(67);
//        n.add(95);
//        n.add(88);
        System.out.println(n);
        System.out.println(Collections.max(n));
        System.out.println(Collections.min(n));


    }
}
