package Day_19.ClassTask;

public class LambdaExpression {
    public static void main(String[] args){
        flyable f =() -> {System.out.println("Flying");};
        f.fly();

    }
}
interface flyable{
    public void fly();

}
