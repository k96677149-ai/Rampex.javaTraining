package Day_18.ClassTak;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> n = new HashMap<>();
        n.put(1,"priya");
        n.put(2,"ramya");
        //n.put(3,"divya");
        n.put(null,"nisha");
        n.put(4,"gokul");  //replace the 4th key
        //n.put(3,null);
       // n.remove(3);  //remove 3rd key
        System.out.println(n.get(2).length());
        //System.out.println(n.get(3).length()); //throw exception because there.length()
        System.out.println(n.getOrDefault(3,"z"));

        System.out.println(n);
        System.out.println(n.containsKey(2));
        System.out.println(n.containsValue("ramya"));

    }
}
