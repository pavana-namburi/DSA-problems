package BST;
import java.util.*;

public class bst {

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        Node root = null;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Insert 2.Delete 3.PreOrder 4.InOrder 5.PostOrder 6.LevelOrder 7.ReverseLevelOrder 0.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter data to insert: ");
                    int val = sc.nextInt();
                    root = insert(root, val);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    int del = sc.nextInt();
                    root = delete(root, del);
                    break;

                case 3:
                    System.out.print("PreOrder: ");
                    preOrder(root);
                    break;

                case 4:
                    System.out.print("InOrder: ");
                    inOrder(root);
                    break;

                case 5:
                    System.out.print("PostOrder: ");
                    postOrder(root);
                    break;

                case 6:
                    System.out.print("LevelOrder: ");
                    levelOrder(root);
                    break;

                case 7:
                    System.out.print("Reverse LevelOrder: ");
                    reverseLevelOrder(root);
                    break;

                case 0:
                    sc.close();
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // INSERT
    public static Node insert(Node root, int x) {

        if (root == null)
            return new Node(x);

        Node parent = null;
        Node curr = root;

        while (curr != null) {
            parent = curr;

            if (x < curr.data)
                curr = curr.left;

            else if (x > curr.data)
                curr = curr.right;

            else {
                System.out.println("Duplicates not allowed.");
                return root;
            }
        }

        if (x < parent.data)
            parent.left = new Node(x);
        else
            parent.right = new Node(x);

        return root;
    }

    // DELETE
    public static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            // Node with one child or no child
            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            // Node with two children
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public static int minValue(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // TRAVERSALS
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // LEVEL ORDER
    public static void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }
    }

    // REVERSE LEVEL ORDER
    public static void reverseLevelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            stack.push(temp);

            if (temp.right != null)
                q.add(temp.right);

            if (temp.left != null)
                q.add(temp.left);
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop().data + " ");
    }
}