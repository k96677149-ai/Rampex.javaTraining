package Day_14.HomeTask;

 class Threads {
    public static void main(String[] args){
        chefthread c1 = new chefthread();
        WaiterThread w1 = new WaiterThread();
        cashierThread t1 = new cashierThread();

//        Thread c2 = new Thread(c1);
//        Thread w2 = new Thread(w1);
//        Thread t2= new Thread(t1);

c1.start();
w1.start();
t1.start();

    }
}
class chefthread extends Thread{
    public  void run() {
        for(int i=0;i<2;i++) {
            System.out.println("Making Noodles");
            //System.out.print(Thread.currentThread().getName());
        }


    }
}
class WaiterThread extends Thread{
    public  void run(){
        for(int i=1;i<=2;i++) {
            System.out.println("serving table" + i);
        }

    }
}
class cashierThread extends Thread{
    public  void run(){
        for(int i=1;i<=2;i++) {
            System.out.println("Generate bill for table" + i);
            System.out.println("collect payment");
        }

    }
}
