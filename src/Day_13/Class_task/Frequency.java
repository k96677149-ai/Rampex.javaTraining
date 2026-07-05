package Day_13.Class_task;

public class Frequency {
    public static void main(String[] args){
        String s = "Good";
        char[] arr =s.toCharArray();  //[g,o,o,d]
        int count=0;
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j] ) {
                    count++;
                }

            }
            System.out.println(arr[i] + ":" + count);
            count = 0;


        }

    }
}
