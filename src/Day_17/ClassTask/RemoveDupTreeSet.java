package Day_17.ClassTask;
import java.util.TreeSet;
import java.util.Arrays;
public class RemoveDupTreeSet {
    public static void main(String[] args){
        int[] arr = {5,3,8,1,5,3,9};
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i:arr){
            ts.add(i);
        }
        System.out.println(ts);
        int[] a = new int[ts.size()];
        int index=0;
        //Object[] objarr = ts.toArray();
        for(int i:ts){
            a[index++]=(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
