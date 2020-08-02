import java.util.Stack;

/**
 * @ClassName: $08022
 * @Description: 合法的括号
 * @Author: Ma Yuanyuan
 */
//左括号入栈，右括号匹配，栈为空，则合法
public class $080202 {
    public boolean isValid(String s) {
        //1.先创建一个栈
        Stack<Character> stack = new Stack<>();
        //循环遍历字符串中的每个字符
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //先判定c是否是左括号，如果是，就入栈
            if(c == '(' || c == '{' || c=='['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
                Character top = stack.pop();
            if(top == '(' && c == ')'){
                continue;
            }
            if(top == '{' && c == '}'){
                continue;
            }
            if(top == '[' && c == ']'){
                continue;
            }
            //除了以上三种情况，其他都是非法情况
            return false;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
