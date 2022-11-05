package leetcode.binary_tree.root_equals_sum_children_2236;

import leetcode.common.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        TreeNode root = new TreeNode(10,left,right);

        System.out.println(checkTree(root));

        TreeNode left2 = new TreeNode(3);
        TreeNode right2 = new TreeNode(1);
        TreeNode root2 = new TreeNode(5,left2,right2);
        System.out.println(checkTree(root2));

    }

    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val+ root.right.val;
    }
}
