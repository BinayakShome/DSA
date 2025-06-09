package BinaryTree.Part2;

public class MaximumPathSum {
    static int maxPathSum(Node root)
    {
        int []maxi = {Integer.MIN_VALUE};

        maxPath(root,maxi);

        return maxi[0];
    }

    static int maxPath(Node root, int[]maxi)
    {
        if(root == null) return 0;

        int leftMaxPath = Math.max(0, maxPath(root.left, maxi));
        int rightMaxPath = Math.max(0, maxPath(root.right, maxi));

        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.data);

        return Math.max(leftMaxPath, rightMaxPath) + root.data;
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

        System.out.println(maxPathSum(root));
    }
}
