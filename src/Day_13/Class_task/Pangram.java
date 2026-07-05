package Day_13.Class_task;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(ispangram("the quick brown fox jumps over the lazy dog"));

    }

    public static boolean ispangram(String name) {
        //String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
              //  "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int letter = 'a';

        name= name.toLowerCase();
         for(int i=0;i<=25;i++){
             if(name.contains(String.valueOf((char)letter++)) == false){
                 return false;
             }
         }


        return true;
    }
}
