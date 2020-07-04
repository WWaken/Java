import java.util.Scanner;

/**
 * @ClassName: $070402
 * @Description:错排问题
 * @Author: Ma Yuanyuan
 */
public class $070402 {
    public static float fenMu(int n){
        //所有的可能性，即分母是人数的全排列
        float result = 0;
        if(n == 1){
            return 1;
        }else if(n > 1){
            result = n*fenMu(n-1);
        }
        return result;
    }
    public static float fenZi(int n){
        //根据错排公式，D(n) = （n-1）* [D(n-2)+D(n-1)]
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else {
            return (n-1)*(fenZi(n-2)+fenZi(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            float x = fenZi(n)/fenMu(n);
            System.out.println(String.format("%.2f",x)+ '%');
        }
    }
}
