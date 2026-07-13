package Day_19.HomeTask;
import java.util.ArrayList;
import java.util.Collections;

public class CharWithMaxOccur {
    public static void main(String[] args){
        String str = "success";
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        int maxfreq = 0;
        char maxchar =' ';
        for(Character i:ch){
            int freq = (Collections.frequency(ch,i));
            if(freq > maxfreq){
                maxfreq = freq;
                maxchar = i;
            }
        }
        System.out.println(maxchar + " = " + maxfreq);

    }
}
