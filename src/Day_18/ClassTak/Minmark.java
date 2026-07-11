package Day_18.ClassTak;
import java.util.HashMap;
import java.util.Map;
public class Minmark {
    public static void main(String[] args){
        HashMap<String,Integer> mark = new HashMap<>();
        mark.put("priya",90);
        mark.put("pavitha",70);
        mark.put("ramya",50);
        mark.put("moni",85);

        int min = 101;
        String name = "";
        for(Map.Entry<String,Integer> e:mark.entrySet()){
            if(e.getValue() < min){
                min = e.getValue();
                name = e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);


    }
}
