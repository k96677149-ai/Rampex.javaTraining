package Day_2.if_else;

import java.util.Scanner;

public class marks_of_student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("mark " + a);
        if (a > 90 && a <= 100) {
            System.out.println("A grade");
        } else if (a > 80 && a <= 90) {
            System.out.println("B grade");
        } else if (a >= 65 && a <= 80) {
            System.out.println("c grade");
        } else {
            System.out.println("fail");
        }

        sc.close();
    }
}
