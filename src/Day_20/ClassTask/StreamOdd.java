package Day_20.ClassTask;
import java.util.Arrays;
public class StreamOdd {
    public static void main(String[] args){
        int[] arr = {3,4,6,7,3,2,1,7,8,9};
        Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach((n)->System.out.println(n));
    }
}
