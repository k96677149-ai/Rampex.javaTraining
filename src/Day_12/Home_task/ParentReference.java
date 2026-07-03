package Day_12.Home_task;

public class ParentReference {

        public static void main(String[] args) {

            Animal c1 = new Cat();

            c1.start();
        }
    }
class Animal {

    void start() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {

    void start() {
        System.out.println("cat");
    }
}
