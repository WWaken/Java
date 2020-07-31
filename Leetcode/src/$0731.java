/**
 * @ClassName: $0731
 * @Description: 两数之和
 * @Author: Ma Yuanyuan
 */
import java.util.Scanner;
public class $0731{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //输入的数字
        int b = a*a; //平方
        System.out.print(add(a)); //a的各位数字之和
        System.out.print(" " + add(b)); //b的各位数字之和（a的平方）
    }
    public static int add(int a){
        int sum=0;
        for(;a != 0;){
            sum = sum + a % 10; //取模计算出各位数字，相加计算各位数字之后
            a = a/10;
        }
        return sum;
    }
}
