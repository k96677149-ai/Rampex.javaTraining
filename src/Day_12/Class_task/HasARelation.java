package Day_12.Class_task;

class Laptop {
    String brand = "Dell";

    void showLaptop() {
        System.out.println("Laptop Brand: " + brand);
    }
}

class Employee {
    String name = "Keerthana";

    Laptop lap = new Laptop(); // Has-A relationship

    void display() {
        System.out.println("Employee Name: " + name);
        lap.showLaptop();
    }
}

public class HasARelation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}