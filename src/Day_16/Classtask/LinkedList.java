package Day_16.Classtask;

import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args){
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(4);
        n.add(5);
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
