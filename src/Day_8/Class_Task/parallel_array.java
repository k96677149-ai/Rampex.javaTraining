package Day_8.Class_Task;

import java.util.Scanner;

public class parallel_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"pepsi", "sprit", "maza", "mountain_dew", "campa"};
        int[] price = new int[]{40, 20, 45, 40, 10};
        int totalbill = 0;
        int[] stock = new int[]{5, 5, 5, 5, 5};
        int amt = 0;
        System.out.println("pepsi,sprit,maza,mountain_dew,campa");

        while (true) {
            System.out.println("Enter the drinks:");
            String drink = sc.nextLine();
            if (drink.equalsIgnoreCase("exit")) {
                System.out.println("total amount is: " + totalbill);
                return;
            }

            System.out.println("Enter the quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < arr.length; ++i) {
                if (drink.equals(arr[i])) {
                    if (qty <= stock[i]) {
                        amt = qty * price[i];
                        totalbill += amt;
                        stock[i] -= qty;
                    } else {
                        System.out.println("out of stock!");
                    }
                }
            }
        }
    }
}
