package Day_13.Home_task;
import java.util.Arrays;
public class FirstNonRepeatChar {
    public static void main(String[] args){
        String s = "swiss";
        char[] arr =s.toCharArray();
        //int count = 0;
        for(int i=0;i<arr.length;i++){
           int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
