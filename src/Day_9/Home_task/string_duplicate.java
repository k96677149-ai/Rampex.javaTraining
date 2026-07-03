package Day_9.Home_task;

public class string_duplicate {

    public static void main(String[] args) {
        String[] arr = new String[]{"sam", "jane", "sam", "jane", "sam"};
        String n = "";

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }

    }
}
