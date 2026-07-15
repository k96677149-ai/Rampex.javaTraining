package Day_21.HomeTask.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Palindrom {
    public static void main(String[] args){
        List<String> list = Arrays.asList("madam", "java", "level", "hello", "radar");
        System.out.println(list.stream().filter(n-> IntStream.range(0,n.length()/2)
                .allMatch(i->n.charAt(i)==n.charAt(n.length()-1-i)))
                .collect(Collectors.toList()));

    }
}
