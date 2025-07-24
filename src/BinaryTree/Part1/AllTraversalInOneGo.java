package BinaryTree.Part1;

import java.util.ArrayList;
import java.util.List;

public class AllTraversalInOneGo {
    static List<List<Integer>> traversal(Node root)
    {
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if(root == null) return new ArrayList<>();
        inOrder(root, in);
        postOrder(root,post);
        preOrder(root, pre);

        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    static void inOrder(Node node, List<Integer> result)
    {
        if(node == null) return;

        inOrder(node.left,result);
        result.add(node.data);
        inOrder(node.right,result);
    }

    static void preOrder(Node node, List<Integer> result)
    {
        if(node == null) return;

        result.add(node.data);
        preOrder(node.left, result);
        preOrder(node.right, result);
    }

    static void postOrder(Node node, List<Integer> result)
    {
        if(node == null) return;

        result.add(node.data);
        postOrder(node.right, result);
        postOrder(node.left, result);
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

        System.out.println(traversal(root));
    }
}
