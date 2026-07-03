package Day_5;

import java.util.Scanner;

public class switch_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("invalid day");
        }

        scanner.close();
    }
}