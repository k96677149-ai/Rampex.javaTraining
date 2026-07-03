package Day_9.Class_task;

public class palindrome {

    public static void main(String[] args) {
        String Origname = "racecar";
        String rev = "";
        int len = Origname.length();

        for (int i = len - 1; i >= 0; --i) {
            rev = rev + Origname.charAt(i);
        }

        System.out.println(rev);
        if (rev.equalsIgnoreCase(Origname)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

    }
}
