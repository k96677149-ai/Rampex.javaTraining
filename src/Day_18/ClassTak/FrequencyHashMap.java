package Day_18.ClassTak;
import java.util.HashMap;
public class FrequencyHashMap {
    public static void main(String[] args){
        HashMap<Character,Integer> a = new HashMap<>();
        String name = "saravanan";
       char[] arr = name.toCharArray();
        for(Character i:arr){
            if(a.containsKey(i)){
                a.put(i,(Integer)(a.get(i))+1);
            }else{
                a.put(i,1);
            }
        }
        System.out.println(a);
   }
}
