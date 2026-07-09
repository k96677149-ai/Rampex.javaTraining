package Day_17.ClassTask;

import java.util.HashSet;
import java.util.Arrays;
public class hashsSet {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
        HashSet<Integer> n = new HashSet<>();
        for(int i:arr){
            n.add(i);
        }
        int[]  num = new int[n.size()];
        int index = 0;
        for(int i:n){
            num[index++] = i;
        }
        System.out.println(n);
        System.out.println(Arrays.toString(num));


    }
}
