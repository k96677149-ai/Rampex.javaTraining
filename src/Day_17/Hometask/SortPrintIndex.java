package Day_17.Hometask;
import java.util.*;
import java.util.ArrayList;
public class SortPrintIndex {
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
        System.out.println("Enter the value:");
        int value = sc.nextInt();

        Collections.sort(n);
        System.out.println("Sorted :" + n);

        for(int i=0;i<n.size();i++){
            if( n.get(i) == value){
                System.out.println("Element found at index :" + i);

            }
        }

    }
}
