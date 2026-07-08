package Day_16.Classtask;

public class duplication {
    public static void main(String[] args) {
        System.out.println(Isduplicate("carrace"));

    }
    public static boolean Isduplicate(String name){
        String t = "car";
        while(true){
            if(name.contains(String.valueOf(t)) == false){
                return false;
            }
            return true;
        }


    }
}

