package Day_24.ClassTask;



public class StackDemo {
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(2);
        s1.push(3);
        s1.push(6);
        s1.push(5);
        s1.push(7);
        s1.push(2);
        System.out.println(s1.pop());

//        s1.pop();
        s1.display();


    }
}
class Stack{
    int[] a;
    int size ;
    int tos;
    int init_cap =5;
    Stack(){
       a= new int [init_cap];
       size = 0;
       tos = -1;
       System.out.println("stack object creatd");
    }

    public void push(int val){
        if(size>=init_cap){
            System.out.println("Stack is full");
            return ;
        }
        tos++;
        a[tos]=val;
        size++;
    }
   public int pop(){
        if(isEmpty()==true){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return a[tos--];
        }


   }


   public void display(){
        for(int i=0;i<=tos;i++){
            System.out.print(a[i] + " ");
        }
   }

   public boolean isEmpty(){
        return tos==-1;
   }
}
