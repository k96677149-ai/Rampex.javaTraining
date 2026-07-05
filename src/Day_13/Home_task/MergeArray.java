package Day_13.Home_task;
import java.util.Arrays;
public class MergeArray {
    public static void main(String[] args){
        int[] a={1,3,5};
        int[] b={2,4,6,7};
        int[] c = new  int[a.length + b.length];
        for(int i=0;i<a.length;i++){
            c[i] = a[i];  //{1,3,5,0,0,0,0}
        }
        for(int i=0;i<b.length;i++){
            c[i + a.length] = b[i];    //{1,3,5,2,4,7,8}
        }
        System.out.println(Arrays.toString(c));
        Arrays.parallelSort(c);
        System.out.println(Arrays.toString(c));

    }
}
