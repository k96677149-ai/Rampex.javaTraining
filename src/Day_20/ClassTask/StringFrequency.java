package Day_20.ClassTask;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;
public class StringFrequency {
    public static void main(String[] args){
//        String name = "nikitha";
//        char[] ch = name.toCharArray();
         HashMap<Character,Integer> hm = new HashMap<>();
         Stream str = Stream.of('n','i','k','i','t','h','a');
         str.forEach(n->hm.put((Character)n,hm.getOrDefault(n,0)+1));
         System.out.println(hm);
    }
}
