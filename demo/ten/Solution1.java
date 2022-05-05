package ten;

import five.TreeNode;

/**
 * 检查是否是平衡二叉树
 * @author Lenovo
 */
public class Solution1 {
    public static boolean flag = true;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        Solution1 solution1 = new Solution1();
        solution1.depth(treeNode);
    }

    public int depth(TreeNode root){
        if (root == null){
            return 0;
        }
        int l = depth(root.getLeft());
        if (l == -1){
            return -1;
        }
        int r = depth(root.getLeft());
        if (r == -1){
            return -1;
        }
        if (Math.abs(l-r)>1){
            flag = false;
            return -1;
        }
        return Math.max(l,r) + 1;
    }

}
