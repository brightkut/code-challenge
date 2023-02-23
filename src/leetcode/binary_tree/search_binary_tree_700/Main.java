package leetcode.binary_tree.search_binary_tree_700;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty() && queue.peek() != null){
            TreeNode t = queue.poll();
            if(t.val == val) return  t;
            queue.add(t.left);
            queue.add(t.right);
        }


        return null;
    }
}
