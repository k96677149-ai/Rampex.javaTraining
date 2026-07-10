package Day_17.ClassTask;
import java.util.Arrays;
import java.util.TreeSet;
public class RemovedupusingMethod {
    public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 4};
    removedup(arr);
    System.out.print(Arrays.toString(arr));
    }
    public static void  removedup(int[] nums){
    TreeSet<Integer> ts = new TreeSet<>();
    for(Integer i:nums) {
        ts.add(i);
    }
    int index = 0;
  for(Integer i:ts) {
      nums[index] = i;
      index++;
  }
}
}