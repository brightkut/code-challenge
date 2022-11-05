package leetcode.binary_tree.find_corresponding_node_1379;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        TreeNode node6 = new TreeNode(6);
        TreeNode node19 = new TreeNode(19);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3,node6,node19);
        TreeNode original = new TreeNode(7,node4,node3);
        TreeNode cloned = original;

        System.out.println(getTargetCopy(original,cloned,node3).val);
        System.out.println(getTargetCopy2(original,cloned,node3).val);
    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        //BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(original);

        Queue<TreeNode> queue2 = new LinkedList<>();
        queue2.add(cloned);

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i< size ; i++){
                TreeNode node = queue.poll();
                TreeNode node2 = queue2.poll();
                if(node == target) return node2;
                if(node.left != null) {
                    queue.add(node.left);
                    queue2.add(node2.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                    queue2.add(node2.right);
                }
            }
        }

        return null;
    }

    //Write by myself
    public static final TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        //DFS Preorder
        return dfsPreOrder(original,cloned,target);
    }

    //DFS Preorder
    public static TreeNode dfsPreOrder(final TreeNode original, final TreeNode cloned, final TreeNode target){
        if(original == null) return null;
        if(original == target) return cloned;

        TreeNode left = dfsPreOrder(original.left,cloned.left,target);
        TreeNode right = dfsPreOrder(original.right,cloned.right,target);

        if(left !=null) return left;
        if(right!= null) return right;

        return null;
    }

}
