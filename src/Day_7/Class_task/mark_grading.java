package Day_7.Class_task;

import java.util.Arrays;
import java.util.Scanner;

public class mark_grading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        String[] sub = new String[5];
        int totalMarks = 0;
        System.out.println("Enter the canditate name:");
        String name = sc.nextLine();

        for(int i = 0; i < marks.length; ++i) {
            System.out.println("Enter the subject name :");
            sub[i] = sc.nextLine();
            System.out.println("Enter the marks " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            sc.nextLine();
            totalMarks += marks[i];
        }

        float percentage = (float)(totalMarks / marks.length);
        System.out.println(name + "congradulation you scored " + totalMarks);
        System.out.println("your percentage : " + percentage + "%");
        System.out.println(Arrays.toString(marks));
    }
}
