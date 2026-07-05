package Day_13.Home_task;

public class ConsecutiveChar {
    public static void main(String[] args){
        String s = "aaabbccccdd";
        char[] arr = s.toCharArray();
        int count = 1;
        for(int i=0;i<arr.length;i++){
                if(i<arr.length - 1 && arr[i] == arr[i+1]) {
                        count++;
                }else{
                    System.out.print(arr[i] + "" + count );
                    count = 1;
                }
        }

    }
}
