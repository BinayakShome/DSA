package BinaryTree.Part1;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalUsingStack {
    static void postorder(Node node, List<Integer> arr)
    {
        if(node == null) return;
        postorder(node.left, arr);
        postorder(node.right, arr);
        arr.add(node.data);
    }
    static List<Integer> postOrder(Node node)
    {
        List<Integer> arr = new ArrayList<>();
        postorder(node, arr);
        return arr;
    }
    public static void main(String []args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(postOrder(root));
    }
}
