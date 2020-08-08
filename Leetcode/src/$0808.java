/**
 * @ClassName: $0808
 * @Description: 只出现一次的数字
 * @Author: Ma Yuanyuan
 */
import java.util.*;
public class $0808{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String N=in.next();
            char arr[]=N.toCharArray();
//check(-90,90,N);
            int val=1;
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<N.length();i++){
                if(map.containsKey(arr[i])){
                    val=val+1;
                    map.put(arr[i],val);
                }else{
                    map.put(arr[i],1);
                }
            }
            int cut=0;
            for(int i=0;i<N.length();i++){
                if(map.get(arr[i])==1){
                    System.out.println(arr[i]);
                    break;
                }else{
                    cut++;
                    if(cut==N.length()){
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}
