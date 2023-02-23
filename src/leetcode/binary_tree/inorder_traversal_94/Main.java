package leetcode.binary_tree.inorder_traversal_94;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(3,null,null);
        TreeNode right = new TreeNode(2,left,null);
        TreeNode root = new TreeNode(1,null,right);

        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur!=null || !stack.isEmpty()){
            while (cur!= null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode p = stack.pop();
            res.add(p.val);
            cur = p.right;
        }

        return res;
    }
}
