package Day_20.ClassTask;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args){
        int[] arr = {4,3,5,4,7,8,2,3,1};
        Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));
    }
}
