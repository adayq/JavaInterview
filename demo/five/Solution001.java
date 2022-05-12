package five;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @author Lenovo
 */
public class Solution001 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSymmetricHelper(root.getLeft(), root.getRight());
    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (right == null && left == null) {
            return true;
        }
        if (right == null || left == null || left.getVal() != right.getVal()) {
            return false;
        }
        return isSymmetricHelper( left.getLeft(),right.getRight()) && isSymmetricHelper(left.getRight(), right.getLeft());
    }
}
