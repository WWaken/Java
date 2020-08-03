import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: $080303
 * @Description: 后序遍历
 * @Author: Ma Yuanyuan
 */
public class $080303 {
    public List<Integer> postorderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
