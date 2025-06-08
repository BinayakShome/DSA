package BinaryTree.Part2;

public class HeightBalancedBinaryTree {
    static boolean isBalanced(Node root)
    {
        return dfsHeight(root) != -1;
    }

    static int dfsHeight(Node root)
    {
        if(root == null) return 0;

        int leftSubTree = dfsHeight(root.left);
        if(leftSubTree == -1) return -1;

        int rightSubTree = dfsHeight(root.right);
        if(rightSubTree == -1) return -1;

        if(Math.abs(leftSubTree - rightSubTree) > 1) return -1;

        return Math.max(leftSubTree, rightSubTree) + 1;
    }
    public static void main(String []args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        System.out.println(isBalanced(root));
    }
}
