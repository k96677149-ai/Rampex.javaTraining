package Day_22.ClassTask;

import java.util.Arrays;

public class TwoSumLinear {
    public static void main(String[] args){
        int[] arr = {2,5,7,11,15};
        int target = 7;
        int[] arr1  = twosum(arr,target);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] twosum(int[] arr,int target){
        int n=arr.length;
        int[] result;
        int check = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                check++;
                System.out.println();
                if(arr[i]+arr[j]==target){
                    return new int []{i,j};
                }
            }
        }
        System.out.println(check);
        return new int[]{};
    }
}
