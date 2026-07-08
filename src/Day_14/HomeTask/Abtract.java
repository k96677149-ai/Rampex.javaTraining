package Day_14.HomeTask;

public class Abtract {
    public static void main(String[] args){
        flyable[] object = new flyable[2];
        object[0] = new Bird();
        object[1] = new Airplan();
        for(flyable obj:object){
            obj.fly();
        }

    }
}
interface flyable  {
    void fly();


}
class Bird implements flyable{
    public  void fly(){
        System.out.println("Bird is flapping wings");
    }

}
class Airplan implements flyable{
    public  void fly(){
        System.out.println("Airplane is engaging engines");
    }
}
