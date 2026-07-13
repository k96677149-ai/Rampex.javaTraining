package Day_20.ClassTask;
import java.util.stream.Stream;
public class StringBigLength {
    public static void main(String[] args){
        Stream<String> s = Stream.of("rahul","keerthi","pravin","kishore");
        System.out.println(s.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
    }
}
