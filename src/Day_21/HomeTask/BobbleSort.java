package Day_21.HomeTask;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3};
        bubbleSort(arr);
    }
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        int temp =0;
        int count = 0;
        int swapcount =0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapcount++;
                }
                count++;
                //System.out.println(Arrays.toString(arr));
            }
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count + " checks");
        System.out.println(swapcount + " swapcount");

        return arr;
    }
}
