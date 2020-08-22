/**
 * @ClassName: $0822
 * @Description: 平衡二叉树
 * @Author: Ma Yuanyuan
 */
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
}
public class $0822 {
    //递归判断左右子树，相差不超过1
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return false;
        }
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1  &&
                IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int m = maxDepth(root.left);
        int n = maxDepth(root.right);
        return 1 + m > n ? m : n;
    }
}
