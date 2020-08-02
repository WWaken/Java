import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: $080201
 * @Description: 次数超过一半
 * @Author: Ma Yuanyuan
 */
public class $080201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[length/2]){
                count++;
            }
        }
        if(count > length/2){
            System.out.println(arr[length/2]);
        }else{
            System.out.println("-1");
        }
    }
}

