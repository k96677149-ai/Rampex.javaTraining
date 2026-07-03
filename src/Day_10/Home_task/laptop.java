package Day_10.Home_task;
import java.util.Scanner;
public class laptop {
    public static void main(String[] args) {
        lap l1 = new lap();

        l1.installapp("Brave");
        l1.installapp("excel");
        l1.installapp("word");
        l1.installapp("Chrome");
        l1.installapp("Notepad");
    }
}

class lap {
    String brand;
    String model;
    int ram;
    int memory;

    public void installapp(String appname) {
        ram = ram - 1;
        System.out.println(appname + "  is intalled in " + this.brand + this.model + " ram avaliable: " + this.ram + " GB");
    }

    lap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand");
        brand = sc.nextLine();

        System.out.println("Enter the model");
        model = sc.nextLine();

        System.out.println("Enter the ram");
        ram = sc.nextInt();

        System.out.println("Enter the memory");
        memory = sc.nextInt();
    }
}

