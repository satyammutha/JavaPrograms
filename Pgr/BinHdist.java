import java.util.Scanner;

public class BinHdist {
    public int findDistance(Node root, int n1, int n2) {
        int lnTOrn = pathLen(root, n1, "lnTOrn") - 2;
        int rnTOrtn = pathLen(root, n2, "rnTOrtn") - 2;
        int lcaData = fLCA(root, n1, n2).data;
        int lcaDist = pathLen(root, lcaData, "lcaDist") - 1;
        return (lnTOrn + rnTOrtn) - 2 * lcaDist;
    }

    public int pathLen(Node root, int n1, String callingFrom) {
        if (root != null) {
            int x = 0;
            if ("rnTOrtn" == callingFrom) {
                if (root.left == null && root.right == null) {
                } else if (root.left == null || root.right == null) {
                    System.out.println("counting the position where the node is not present is : " + root.data);
                }
                if ((root.data == n1) || (x = pathLen(root.left, n1, "rnTOrtn")) > 0
                        || (x = pathLen(root.right, n1, "rnTOrtn")) > 0) {
                    return x + 1;
                }
            }
            if ("rnTOrtn" != callingFrom) {
                if ((root.data == n1) || (x = pathLen(root.left, n1, "lnTOrn")) > 0
                        || (x = pathLen(root.right, n1, "lnTOrn")) > 0) {
                    return x + 1;
                }
            }
            return 0;
        }
        return 0;
    }

    public Node fLCA(Node root, int n1, int n2) {
        if (root != null) {
            if (root.data == n1 || root.data == n2) {
                return root;
            }
            Node left = fLCA(root.left, n1, n2);
            Node right = fLCA(root.right, n1, n2);
            if (left != null && right != null) {
                return root;
            }
            if (left != null) {
                return left;
            }
            if (right != null) {
                return right;
            }
        }
        return null;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("***Find Horizontal Distance between two Nodes from Binary Tree:***");
        System.out.println("Enter Node1:");
        int no1 = input.nextInt();
        System.out.println("Enter Node2:");
        int no2 = input.nextInt();
        Node root = new Node(5);
        root.right = new Node(3);
        root.left = new Node(2);
        root.right.right = new Node(1);
        root.right.right.right = new Node(6);
        root.left.left = new Node(7);
        root.left.left.left = new Node(9);
        root.right.right.left = new Node(4);
        BinHdist binaryTreeTest = new BinHdist();
        System.out.println("Distance between No1 and No2 is : " + binaryTreeTest.findDistance(root, no1, no2));
    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}