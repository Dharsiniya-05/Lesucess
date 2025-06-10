import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class CountLeafNodes {

    public static TreeNode buildTree(String[] input) {
        if (input.length == 0 || input[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < input.length) {
            TreeNode node = queue.poll();

            if (!input[i].equals("-1")) {
                node.left = new TreeNode(Integer.parseInt(input[i]));
                queue.add(node.left);
            }
            i++;
            if (i >= input.length) break;

            if (!input[i].equals("-1")) {
                node.right = new TreeNode(Integer.parseInt(input[i]));
                queue.add(node.right);
            }
            i++;
        }

        return root;
    }

    public static int countLeaf(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeaf(root.left) + countLeaf(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        TreeNode root = buildTree(input);

        int leaves = countLeaf(root);
        System.out.println("Number of Leaf Nodes: " + leaves);
    }
}
