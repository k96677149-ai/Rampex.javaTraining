package Day_18.ClassTak;
import java.util.*;
import java.util.PriorityQueue;
public class prioQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the Element:");
        //int[] n = new int[size];
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for(int i=0;i<size;i++){
            a.add(sc.nextInt());
        }
        System.out.println(a);


    }
}
