package BinaryTree.Part1;

import java.util.ArrayList;
import java.util.List;

//class Node
//{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int key)
//    {
//        data = key;
//        left = null;
//        right = null;
//    }
//}
public class PreOrderTraversal {
    static List<Integer> preorder(Node root)
    {
        List<Integer> result = new ArrayList<>();
        preOrderHelper(root,result);
        return result;
    }

    static void preOrderHelper(Node node, List<Integer> result)
    {
        if(node == null) return;

        result.add(node.data);
        preOrderHelper(node.left, result);
        preOrderHelper(node.right, result);
    }
    public static void main(String []args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(preorder(root));
    }
}
