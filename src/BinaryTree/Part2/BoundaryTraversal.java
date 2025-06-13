package BinaryTree.Part2;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    static boolean isleafNode(Node root)
    {
        return root.left == null && root.right == null;
    }

    static void addLeftBoundary(Node root, List<Integer> res)
    {
        Node curr = root.left;
        while(curr != null)
        {
            if(!isleafNode(curr))
            {
                res.add(curr.data);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    static void addRightBoundary(Node root, List<Integer> res)
    {
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isleafNode(curr)) {
                temp.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for (int i = temp.size() - 1; i >= 0; --i) {
            res.add(temp.get(i));
        }
    }
    static void addLeaves(Node root, List<Integer> res)
    {
        if(isleafNode(root))
        {
            res.add(root.data);
            return;
        }
        if (root.left != null) {
            addLeaves(root.left, res);
        }
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }
    static List<Integer> printElement(Node root)
    {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        if (!isleafNode(root)) {
            res.add(root.data);
        }
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
    }
    static void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
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

        printResult(printElement(root));
    }
}
