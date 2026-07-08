package Day_10.Home_task;
import java.util.Scanner;
public class DrinkTest {
    public static void main(String[] args) {

        System.out.println("WELCOME !!");
        System.out.println("Enter 1 for maza");
        System.out.println("Enter 2 for sprit");
        System.out.println("Enter 3 for pepsi");
        System.out.println("Enter 4 for campa");
        System.out.println("Enter 0 to Exit");
        float total = 0;
        int choice;
        int qty = 0;
        int pos = 0;
        drink[] totalitems = new drink[100];


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();
                try {
                    if (qty <= 0) {
                        System.out.println("Enter your qty: ");
                        qty = sc.nextInt();
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println("Error : Quentity can't be zero or negative");
                }


                if (choice == 1) {
                    maza m1 = new maza();

                        total = total + (qty * m1.price);
                    totalitems[pos++] = m1;
                    System.out.println("Items " + m1.name + " price " + m1.price);
                }
                if (choice == 2) {
                    sprit s1 = new sprit();
                    total = total + (qty * s1.price);
                    totalitems[pos++] = s1;
                    System.out.println("Items " + s1.name + " price " + s1.price);
                }
                if (choice == 3) {
                    pepsi p1 = new pepsi();
                    total = total + (qty * p1.price);
                    totalitems[pos++] = p1;
                    System.out.println("Items " + p1.name + " price " + p1.price);
                }
                if (choice == 4) {
                    campa c1 = new campa();
                    total = total + (qty * c1.price);
                    totalitems[pos++] = c1;
                    System.out.println("Items " + c1.name + " price " + c1.price);
                }
            }
            while (choice != 0) ;
            System.out.println("total amounr : " + total);


        }
    }

    class drink {

        String name;
        float price;
        int stock;
    }

    class maza extends drink {
        String name = "maza";
        float price = 20f;
        int stock = 5;
    }

    class sprit extends drink {
        String name = "sprit";
        float price = 40f;
        int stock = 5;
    }

    class pepsi extends drink {
        String name = "pepsi";
        float price = 30f;
        int stock = 5;
    }

    class campa extends drink {
        String name = "campa";
        float price = 10f;
        int stock = 5;
    }

