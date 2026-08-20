package Day_29.ClassTask;

public class SkipChar {
    public static void main(String[] args){
        String str = "bccad";
        String str1 = "";
        int len = str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'){
                continue;
            }else{
               str1 = String.valueOf(str.charAt(i));
            }
            System.out.print(str1);
        }
    }
}
