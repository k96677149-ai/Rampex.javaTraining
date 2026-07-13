package Day_19.HomeTask;
import java.util.ArrayList;
public class GroupWordBasedOnLength {
    public static void main(String[] args){
        String[] word = {"Java", "API", "Spring", "Collection", "Map", "Queue"};
        ArrayList<String> str = new ArrayList<>();
        for(String i:word){
            str.add(i);
        }
        for(String i:word){
            int n = i.length();
            for(String j:word){
            if(j.length() == n) {
                System.out.println(i);
            }

            }
            //System.out.println(i + "->" + i.length());
        }
    }
}
