/**
 * @ClassName: $080401
 * @Description: java类作用描述
 * @Author: Ma Yuanyuan
 */



public class $080401 {
    public static boolean isSameTree(Node p, Node q){
        if(p == null && q == null){
            return true;
        }
        if(p == null|| q == null){
            return false;
        }
        //两个树都不为空
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left ,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSubTree(Node s, Node t){
        if(s == null && t == null){
            return false;
        }
        if(s == null || t == null){
            return true;
        }
        boolean ret = false;
        ret = isSameTree(s,t);
        return ret || isSubTree(s.left,t) || isSubTree(s.right,t);
    }
}
