package Day_17.Hometask;
import java.util.*;
import java.util.ArrayList;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] num = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Element:");
            num[i] = sc.nextInt();
        }
        ArrayList<Integer> n = new ArrayList<>();
        for(int i:num){
            n.add(i);
        }
        System.out.println("Enter the indices:");
        int i = sc.nextInt();
        int j = sc.nextInt();

        int temp = n.get(i);
        n.set(i,n.get(j));
        n.set(j,temp);

        System.out.println(n);



    }
}
