package Day_17.Hometask;
import java.util.ArrayList;
import java.util.*;
public class NameInAscDesOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        sc.nextLine();


        ArrayList<String> n = new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter the element:");
            n.add(sc.nextLine());
        }
        Collections.sort(n);
        System.out.println("Ascending : " + n);
        Collections.reverse(n);
        System.out.println("Descending :" + n);


    }

}
