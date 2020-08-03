import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: $080302
 * @Description: 二叉树的中序遍历
 * @Author: Ma Yuanyuan
 */

public class $080302 {
    public List<Integer> inorderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
