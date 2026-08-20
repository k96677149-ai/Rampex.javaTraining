package Day_23.ClassTask;

import java.util.ArrayList;

public class LinearDynamicArray {
    public static void main(String[] args) {

        DynamicArray d = new DynamicArray();

        d.insert(2);
        d.insert(5);
        d.insert(6);
        d.insert(2);
        d.insert(1, 55);
        d.insert(2);
        d.insert(2);
        d.insert(2);

        d.delete();

        d.display();

        System.out.println("Element at index 0 : " + d.get(0));
        System.out.println("Is Empty : " + d.isEmpty());
        System.out.println("Size : " + d.size());

        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(3);

        System.out.println(al);
    }
}

class DynamicArray {

    int[] arr;
    int pos;
    int size;

    DynamicArray() {
        arr = new int[5];
        pos = 0;
        size = 0;
    }

    // Display
    public void display() {
        System.out.print("[");

        for (int i = 0; i < pos; i++) {
            System.out.print(arr[i]);

            if (i != pos - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    // Insert at end
    public void insert(int value) {

        if (pos == arr.length) {
            resize();
        }

        arr[pos] = value;
        pos++;
        size++;
    }

    // Resize
    public void resize() {

        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    // Delete last element
    public void delete() {

        if (pos == 0) {
            System.out.println("Array is empty.");
            return;
        }

        pos--;
        arr[pos] = 0;
        size--;
    }

    // Insert at index
    public void insert(int index, int value) {

        if (index < 0 || index > pos) {
            System.out.println("Invalid Index");
            return;
        }

        if (pos == arr.length) {
            resize();
        }

        for (int i = pos; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        pos++;
        size++;
    }

    // Get element
    public int get(int index) {

        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        return arr[index];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return size
    public int size() {
        return size;
    }
}