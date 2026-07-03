package Day_8.Class_Task;

import java.util.Scanner;

public class user_id {

    public static void main(String[] args) {
        String userId = "Insta@1234";
        Scanner sc = new Scanner(System.in);
        String InputId = sc.nextLine();
        if (InputId.equals(userId)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }

    }
}
