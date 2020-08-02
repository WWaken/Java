import java.util.Stack;

/**
 * @ClassName: $080204
 * @Description: 用两个栈实现队列
 * @Author: Ma Yuanyuan
 */
public class $080204 {
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public void push(int x){
        while(!B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }

    public Integer pop(){
        if(empty()){
            return null;
        }
       while(!A.isEmpty()){
           int tmp = A.pop();
           B.push(tmp);
       }
       return B.pop();
    }

    public Integer peek(){
        if(empty()){
            return null;
        }
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }

    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}
