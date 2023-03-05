package leetcode.binary_tree.symmetic_tree_101;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null ) return  true;

        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            for(int i = 0 ; i < queue.size();i++){
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();

                if(left == null && right == null) continue;
                if((left==null && right!=null) || (left!=null && right ==null)) return false;
                if(left.val != right.val) return false;

                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
        }

        return true;
    }
}
