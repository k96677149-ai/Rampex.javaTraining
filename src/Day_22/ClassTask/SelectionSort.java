package Day_22.ClassTask;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {2,4,5,3,1};
        int temp =0;

        int n = arr.length;
        for(int i=0;i<n-1;i++){
           int minIndex =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex =j;

                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
