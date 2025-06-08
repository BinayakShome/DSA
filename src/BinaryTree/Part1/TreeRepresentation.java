package BinaryTree.Part1;

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        data = key;
        left = null;
        right = null;
    }
}

public class TreeRepresentation {
    public static void main(String []args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
    }
}
