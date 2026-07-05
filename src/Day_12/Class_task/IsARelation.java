package Day_12.Class_task;

public class IsARelation {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.Start();


    }
}
class Car{
    String brand;
    String model;
    public static void Start(){
        System.out.println("Car Stared");
    }
}
class TaTaCar extends Car{
    public static void Start(){
        System.out.println("Car Starting");
    }
}