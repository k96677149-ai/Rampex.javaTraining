package Day_11.Home_task;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("pot", "top"));

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2) == true) {
                return true;
            }

        }
        return false;
    }
}

