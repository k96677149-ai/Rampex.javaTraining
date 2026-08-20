package Day_26.ClassTask;

public class BinarySearchTree {
    public static void main(String[] args){

//        BinaryTree b1 = new BinaryTree(1);
//        b1.insertLeft(b1.root,2);
//        b1.insertrigth(b1.root,3);
//        b1.insertLeft(b1.root.left,4);
//        b1.insertrigth(b1.root.left,5);
//        b1.insertLeft(b1.root.rigth,6);
//        b1.insertrigth(b1.root.rigth,7);
//
//
//        b1.preorder(b1.root);
//        System.out.println();
//        b1.postorder(b1.root);
//        System.out.println();
//        b1.Inorder(b1.root);

        searchTree b1 = new searchTree(5);
        b1.insert(b1.root,2);
        b1.insert(b1.root,1);
        b1.insert(b1.root,3);
        b1.insert(b1.root,7);
        b1.insert(b1.root,4);
        b1.insert(b1.root,9);
        b1.insert(b1.root,8);
        b1.insert(b1.root,6);

        b1.Inorder(b1.root);

    }

}

class searchTree {

    class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data) {
            this.data= data;
            this.left = null;
            this.rigth = null;
        }
    }

    Node root;

    searchTree(int data) {
        root = new Node(data);
    }

    void insert(Node root,int data){
       if(root.data>data){ //left insert
           if(root.left==null){
               root.left = new Node(data);
           }else{
               insert(root.left,data);
           }
       }else { // rigth insert
           if (root.rigth == null) {
               root.rigth = new Node(data);
           }else{
               insert(root.rigth ,data);
           }
       }
    }

    void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.rigth);

    }

    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.rigth);
        System.out.print(root.data + " ");

    }

    void Inorder(Node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.rigth);
    }
}

















