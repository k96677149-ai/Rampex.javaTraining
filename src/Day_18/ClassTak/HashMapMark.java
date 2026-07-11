package Day_18.ClassTak;
import java.util.Map;
import java.util.HashMap;
public class HashMapMark {
    public static void main(String[] args){
        HashMap<String,Integer> mark = new HashMap<>();
        mark.put("priya",90);
        mark.put("pavitha",70);
        mark.put("ramya",50);
        mark.put("moni",85);

        int max = 0;
        String name="";
       for(Map.Entry<String,Integer> e:mark.entrySet()){
           if(e.getValue() > max){
               max = e.getValue();
               name = e.getKey();
           }
       }

        System.out.println(name);
        System.out.println(max);
    }
}
