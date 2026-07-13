package Day_20.ClassTask;
import java.util.stream.Stream;
import java.util.stream.Stream;;
public class StreamIterate {
    public static void main(String[] args){
        Stream.iterate(0,n -> n+2).limit(10).forEach(n->System.out.println(n));
        //infinite stream to stop limit using limit
    }
}
