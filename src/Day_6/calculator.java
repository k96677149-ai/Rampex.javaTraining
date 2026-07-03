package Day_6;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Menu driven calculater----");
        System.out.println("1.Addtion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multilication");
        System.out.println("4.division");
        System.out.println("5.Exit");
        System.out.println("Enter your choic 1 to 5:");
        int n = scanner.nextInt();
        if (n == 5) {
            System.out.println("Existing from calculater");
        }

        if (n <= 0 || n > 5) {
            System.out.println("Invalid ! pls choose another choice");
        }

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        switch (n) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
                break;
            case 4:
                if (num1 != (double)0.0F && num2 != (double)0.0F) {
                    System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
                } else {
                    System.out.println("division by 0 are not allowed");
                }
        }

        scanner.close();
    }
}


