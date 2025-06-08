package BinaryTree.Part1;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    static List<Integer> inorder(Node root)
    {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    static void helper(Node node, List<Integer> result)
    {
        if(node == null) return;

        helper(node.left,result);
        result.add(node.data);
        helper(node.right,result);
    }
    public static void main(String []args)
    {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        System.out.println(inorder(root));
    }
}
