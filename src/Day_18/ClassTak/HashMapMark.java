package Day_18.ClassTak;
import Day_17.Hometask.MaxMin;

import java.util.HashMap;
public class HashMapMark {
    public static void main(String[] args){
        HashMap<String,Integer> mark = new HashMap<>();
        mark.put("priya",90);
        mark.put("pavitha",70);
        mark.put("ramya",50);
        mark.put("moni",85);

        int max = 0;
       for(Integer i :mark.values()){
           if(i > max){
               max = i;
           }
       }
        System.out.println(max);
    }
}
