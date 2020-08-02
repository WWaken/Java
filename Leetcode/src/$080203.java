import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: $080203
 * @Description: 用两个队列实现栈
 * @Author: Ma Yuanyuan
 */
public class $080203 {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();
    public void push(int x ){
        A.offer(x);
    }
    public Integer pop(){
        if(empty()){
            return null;
        }
        while(A.size() > 1) {
            Integer front = A.poll();
            B.offer(front);
        }
        //剩下一个元素就是要被出栈的
        int ret =A.poll();
        swap();
        return ret;
    }
    private void swap(){
        Queue<Integer> temp = A;
        A = B;
        B = temp;
    }
    public Integer top(){
        if(empty()){
            return null;
        }
        while(A.size() > 1) {
            Integer front = A.poll();
            B.offer(front);
        }
        //剩下一个元素就是要被出栈的
        int ret =A.poll();
        B.offer(ret);
        swap();
        return ret;
    }
    public boolean empty(){
        return A.isEmpty();
    }
}
