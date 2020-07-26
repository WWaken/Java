import java.util.Scanner;

/**
 * @ClassName: $0726
 * @Description: 判断IP地址是否有效
 * @Author: Ma Yuanyuan
 */
public class $0726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipStr = sc.next();
        boolean isIpLegal = isIpLegal(ipStr);
        if(isIpLegal){
            System.out.println(ipStr + "合法");
        }else{
            System.out.println(ipStr + "不合法");
        }
    }
    public static boolean isIpLegal(String str) {
        //检查ip是否为空
        if (str == null) {
            return false;
        }
        //如果ip为x.x.x.x，最少为7位；ip为xxx.xxx.xxx.xxx,最多为15位
        if (str.length() < 7 || str.length() > 15) {
            return false;
        }
        //如果在str的首位或末尾为".",不合法
        if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        //对str按"."进行分割，少于4个，为非法
        String[] arr = str.split("\\.");
        if (arr.length != 4) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i].length() == 1 && arr[i].charAt(0) == '0') {
                return false;
            }
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) < '0' || arr[i].charAt(j) > '9'){
                    return false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(arr[i]);
            if(i == 0){
                if(temp < 1|| temp > 255){
                    return false;
                }
            }else{
                if(temp < 0 || temp >255){
                    return false;
                }
            }
        }
        return true;
    }
}
