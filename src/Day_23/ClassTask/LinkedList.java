package Day_23.ClassTask;

public class LinkedList {
    public static void main(String[] args){
        Node1 n1 = new Node1();
        n1.val = 5;
        n1.next = null;
        System.out.println(n1.val);

        Node1 n2 = new Node1();
        n2.val = 10;
        n2.next = n1;
        System.out.println(n2.next);

        Node1 n3 = new Node1();
        n2.next = n3;

    }
}
class Node1{
    int val;
    Node1 next;
}