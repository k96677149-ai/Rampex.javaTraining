package Day_2.if_else;

import java.util.Scanner;

public class signal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the colour:");
        String colour = scanner.nextLine();
        if (colour.equals("red")) {
            System.out.println("Stop");
        } else if (colour.equals("yellow")) {
            System.out.println("Ready");
        } else if (colour.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid colour");
        }

        scanner.close();
    }
}
