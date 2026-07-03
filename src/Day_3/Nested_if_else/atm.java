package Day_3.Nested_if_else;

import java.math.BigDecimal;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Originalpin = 2007;
        BigDecimal balance = new BigDecimal("1000");
        System.out.print("are you instered the card?yes / no :");
        String a = scanner.nextLine();
        if (a.equals("yes")) {
            System.out.println("welcome!");
            System.out.println("Enter the username:");
            String username = scanner.nextLine();
            if (username.equals("Divya")) {
                System.out.println("logined successfully");
                System.out.println("Enter the pin:");
                int pin = scanner.nextInt();
                if (pin == Originalpin) {
                    System.out.println("pin is correct");
                    System.out.println("Enter the amount:");
                    BigDecimal amount = scanner.nextBigDecimal();
                    BigDecimal remaining = amount.subtract(balance);
                    if (amount.compareTo(balance) <= 0) {
                        System.out.println("Debeted successfully");
                        System.out.println("remaininga balance : " + String.valueOf(remaining));
                    } else {
                        System.out.println("Inseffient amount");
                    }
                } else {
                    System.out.println("pin is incorrect");
                }
            } else {
                System.out.println("incorrect username!pls enter again");
            }
        } else {
            System.out.println("pls insert the card!");
        }


    }
}
