package Day_17.Hometask;
import java.util.*;
import java.util.ArrayList;
public class CountTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();


        int[] num = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Element:");
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the number to count:");
        int num1 = sc.nextInt();

        ArrayList<Integer> n = new ArrayList<>();
        for(int i:num){
            n.add(i);
        }

        int count = 0;
        for(int i:n){
            if(i==num1){
                count++;
            }

        }
        System.out.println(count);

    }
}
