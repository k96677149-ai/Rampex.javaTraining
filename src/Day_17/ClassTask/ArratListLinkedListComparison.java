package Day_17.ClassTask;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArratListLinkedListComparison {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();
        long start = System.nanoTime();
        for(int i=1;i<1000000;i++){
            arr.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        long lstart = System.nanoTime();
        for(int i=1;i<1000000;i++){
            li.add(i);
        }
        long lend = System.nanoTime();
        System.out.println(lend - lstart);
//        System.out.println(System.nanoTime());
//        Thread.sleep(3000);
//        System.out.println(System.nanoTime());

    }
}
