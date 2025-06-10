import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class LevelOrderTraversal {

    public static TreeNode buildTreeLevelOrder(String[] input) {
        if (input.length == 0 || input[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < input.length) {
            TreeNode current = queue.poll();

            if (!input[i].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(input[i]));
                queue.add(current.left);
            }
            i++;
            if (i >= input.length) break;

            if (!input[i].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(input[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        TreeNode root = buildTreeLevelOrder(input);

        List<Integer> result = levelOrder(root);
        System.out.println("Level Order Traversal: " + result);
    }
}
