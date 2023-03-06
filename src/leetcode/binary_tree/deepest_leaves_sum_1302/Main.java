package leetcode.binary_tree.deepest_leaves_sum_1302;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxSum = 0;
        int count = 1;

        while (!queue.isEmpty()){
            int size = 0;
            int sum = 0;
            for(int i = 0 ; i < count ; i++){
                TreeNode t = queue.poll();
                sum+=t.val;

                if(t.left!= null) {
                    queue.add(t.left);
                    size++;
                }

                if(t.right != null){
                    queue.add(t.right);
                    size++;
                }
            }

            maxSum = sum;
            count = size;
        }

        return maxSum;
    }

}
