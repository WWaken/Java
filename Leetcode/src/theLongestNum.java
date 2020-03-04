import java.util.Scanner;

public class theLongestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int count = 0;
            int max = 0;
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if (count > max) {
                        max = count;
                        index = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(index - max + 1, index + 1));
        }
    }
}
