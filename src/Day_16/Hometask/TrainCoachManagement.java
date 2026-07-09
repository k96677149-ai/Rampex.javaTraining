package Day_16.Hometask;

import java.util.ArrayList;

public class TrainCoachManagement {
    public static void main(String[] args){
        ArrayList<String> n = new ArrayList<>();
        n.add(0,"Engine");
        n.add(1,"Coach 2");
        n.add(2,"Coach 1");
        n.add(3,"Guard");
        n.remove(3);
        System.out.println(n);

    }
}
