package Day_26.ClassTask;
public class BinaryTreeImplementation {
    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree(1);
        b1.insertLeft(b1.root,2);
        b1.insertrigth(b1.root,3);
        b1.insertLeft(b1.root.left,4);
        b1.insertrigth(b1.root.left,5);
        b1.insertLeft(b1.root.rigth,6);
        b1.insertrigth(b1.root.rigth,7);


        b1.preorder(b1.root);
        System.out.println();
        b1.postorder(b1.root);
        System.out.println();
        b1.Inorder(b1.root);

    }

    }

    class BinaryTree {

    class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }
    }

    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    void insertLeft(Node node, int data) {
        node.left = new Node(data);
    }

    void insertrigth(Node node, int data) {
        node.rigth = new Node(data);
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
















