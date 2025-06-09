package BinaryTree.Part2;

public class DiameterOfTree {
    static int diameter(Node root)
    {
        int []diameter = new int[1];
        diameter[0] = 0;

        helper(root,diameter);

        return diameter[0];
    }

    static int helper(Node root, int[] diameter)
    {
        if(root == null) return 0;

        int []lh = new int[1];
        int []rh = new int[1];
        lh[0] = helper(root.left, diameter);
        rh[0] = helper(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh[0] + rh[0]);

        return 1 + Math.max(lh[0], rh[0]);
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

        System.out.println(diameter(root));
    }
}
