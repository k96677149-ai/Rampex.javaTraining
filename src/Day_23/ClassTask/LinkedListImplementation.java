package Day_23.ClassTask;


import java.util.NoSuchElementException;



public class LinkedListImplementation {
    public static void main(String[] args){


        Linkedlist li = new Linkedlist();
        li.insertbeginning(60);
        li.insertbeginning(10);
        li.insertbeginning(20);
        li.insertbeginning(30);
        li.insertAtEnd(101);
        li.insertAtPos(4,105);
        li.deleteFirst(4);
        li.display();
        //isEmpty();

    }
}


class Linkedlist {
    Node head;
    int size;

    public void insertbeginning(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            size++;

        }

    }

    public void insertAtPos(int index, int val) {
        if (!(index >= 0 && index <= size)) {
            System.out.println("Invalid index");
        }


        Node newnode = new Node(val);
        if (index == 0) {
            insertbeginning(val);
        } else {
            //travers to the less than index
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        size++;

    }

    public void deleteFirst(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
            size--;
        }

    }


    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp != null) {
                System.out.print(temp.val + " ->");
                temp = temp.next;
            }
        }
    }

    public boolean isEmpty() {

        return head == null;
    }


    private static class Node {
        int val;
        Node next;

        Node(int value) {
            val = value;
        }
    }
}
