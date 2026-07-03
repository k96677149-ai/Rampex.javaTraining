package Day_4.For_loop;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the which tables you need to show: ");
        int a = scanner.nextInt();

        for(int i = 1; i <= 20; ++i) {
            System.out.println(i + " x " + a + " = " + i * a);
        }

        scanner.close();
    }
}

