package Day_13.Class_task;

public class Infinite {
    public static void main(String[] args){
        //int[] arr =new int[-5];
        int a = 10;
        int b= 5;
        int c= 5;
        int x = a/(b+c);
        System.out.println("x: " + x);
        try {
            int y = a / (b - c);
            System.out.println("y: " + y);
        }
        catch(Exception e){

        }
        System.out.println("program ended");

    }
}
