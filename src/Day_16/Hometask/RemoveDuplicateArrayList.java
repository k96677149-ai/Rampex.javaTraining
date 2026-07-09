package Day_16.Hometask;

import java.util.ArrayList;

public class RemoveDuplicateArrayList {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
       ArrayList<Integer> n = new ArrayList<>();
       for(int i:arr){
           n.add(i);
       }
//        n.add(1);
//        n.add(2);
//        n.add(2);
//        n.add(3);
//        n.add(4);
//        n.add(4);
//        n.add(5);
        ArrayList<Integer> unique = new ArrayList<>();
        for(int num : n){
            if(!unique.contains(num)){
                unique.add(num);
            }
        }
          System.out.println(n);
          System.out.println(unique);
    }
}
