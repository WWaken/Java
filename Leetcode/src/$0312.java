import java.util.Scanner;

public class $0312{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }
    public static String reverse(int n){
        if(n < 10){
            return Integer.toString(n);
        }
        int end = n - (n/10)*10;
        return Integer.toString(end) + reverse(n/10);
    }
}
