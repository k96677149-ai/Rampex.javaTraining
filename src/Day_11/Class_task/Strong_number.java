package Day_11.Class_task;

import java.util.Scanner;
public class Strong_number {
    static void main(String[] ars){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int original = n;
    int sum = 0;

    for(int i = n;i > 0 ; i = i/10)

    {
        int digit = i % 10;
        int fact = 1;

        for (int j = 1; j <= digit; j++) {
            fact = fact * j;
        }
        sum += fact;

    }
        if (original == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
