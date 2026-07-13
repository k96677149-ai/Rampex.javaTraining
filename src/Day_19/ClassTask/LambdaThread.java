package Day_19.ClassTask;

public class LambdaThread {
        public static  void main(String[] args){
        //Thread t1 = new Thread () -> {System.out.println("new thread created");};
        Thread t1=new Thread(() -> {System.out.println("new thread created");
        });
        t1.start();

    }
}
@ FunctionalInterface
interface flyale{
    //don't allow  multiple interface in lambda because it confuse

    public void fly();
}
