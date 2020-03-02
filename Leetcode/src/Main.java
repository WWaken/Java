import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s1.length();i++) {
            StringBuffer sb = new StringBuffer(s1);
            sb.insert(i, s2);
            if (isPalindrome(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
