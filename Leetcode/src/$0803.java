import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: $0803
 * @Description: 二叉树的前序遍历
 * @Author: Ma Yuanyuan
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }
}
public class $0803 {
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            //元素个数为0，但不是null
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
