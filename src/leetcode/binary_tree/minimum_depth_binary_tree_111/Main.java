package leetcode.binary_tree.minimum_depth_binary_tree_111;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //[3,9,20,null,null,15,7]

        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        TreeNode right = new TreeNode(20,n15,n7);
        TreeNode left = new TreeNode(9,null,null);
        TreeNode root = new TreeNode(3,left,right);

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode>queue = new LinkedList<>();

        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int s = queue.size();

            // we use for because if not depth will always increase every time we go to node
            //we would like it increases when check all node in that level
            for (int i = 0; i < s; i++) {
                TreeNode temp = queue.poll();
                //is leaf
                if (temp.left == null && temp.right == null) return depth;
                //check left
                if (temp.left != null) queue.add(temp.left);
                //check right
                if (temp.right != null) queue.add(temp.right);
            }

            depth++;
        }

        return depth;
    }

    public int minDepth2(TreeNode root) {
        if(root == null) return 0;
        int dept = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;
        while (!queue.isEmpty()){
            int size = 0;
            for(int i= 0 ; i < count ; i++){
                TreeNode q = queue.poll();
                if(q.left == null && q.right == null) return dept;
                if(q.left != null){
                    queue.add(q.left);
                    size++;
                }
                if(q.right != null){
                    queue.add(q.right);
                    size++;
                }
            }
            dept++;
            count= size;
        }

        return dept;
    }
}
