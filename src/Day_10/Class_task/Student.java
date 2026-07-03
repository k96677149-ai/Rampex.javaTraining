package Day_10.Class_task;

public class Student {
    public static void main(String[] args) {
        Ststic s1 = new Ststic();
        s1.name = "keerthana";
        s1.id = 123;
        System.out.println(s1.name);
        System.out.println(s1.id);
        s1.Study();
        s1.Hackthon();
    }
}


class Ststic  {
        String name;
        int id;
        static String dept = "AI DS";


        public static void Study() {
            System.out.println(dept);
        }

        public void Hackthon() {
            System.out.println(this.name);
            System.out.println("doing hackthon");
            System.out.println(dept);
        }
    }
