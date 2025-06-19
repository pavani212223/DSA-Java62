class Node {
    String key;
    Node left, right;
    public Node(String item) {
        key = item;
        left = right = null;
    }
}
public class BinaryTreeProject {
    Node root;
    void traverseInorder(Node node) {
        if (node != null) {
            traverseInorder(node.left);
            System.out.println(node.key + " ");
            traverseInorder(node.right);
        }
    }
    void traversePreorder(Node node) {
        if (node != null) {
            System.out.println(node.key + " ");
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
    void traversePostorder(Node node) {
        if (node != null) {
            traversePostorder(node.left);
            traversePostorder(node.right);
            System.out.println(node.key + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeProject tree = new BinaryTreeProject();
        tree.root = new Node("Pavani");
        tree.root.left = new Node("Mohan Reddy");
        tree.root.right = new Node("Sarada");
        tree.root.left.left = new Node("kusuma");
        tree.root.left.right = new Node("Sanvii");
        tree.root.right.left = new Node("Babul");
        tree.root.right.right = new Node("Hema");
        System.out.print("Binary Tree (Inorder): ");
        tree.traverseInorder(tree.root);
        System.out.println();
        System.out.print("Binary Tree (Preorder): ");
        tree.traversePreorder(tree.root);
        System.out.println();
        System.out.print("Binary Tree (Postorder): ");
        tree.traversePostorder(tree.root);
        System.out.println();
    }
}