import java.util.Scanner;

public class $0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = Divisor(a, b);
        System.out.println(a * b/m);
    }
    public static int Divisor(int x, int y){
        if(x == y){
            return x;
        } else if(x < y){
            int z = x;
            x = y;
            y = z;
        }
        int c = x % y;
        while(c != 0){
            x = y;
            y = c;
            c = x % y;
        }
        return y;
    }
}
