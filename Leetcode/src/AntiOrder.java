public class AntiOrder {
        public static int count(int[] A, int n) {

            int count = 0;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n;j++){
                    if(A[i] > A[j]){
                       count++;
                    }
                }
            }
            return count;
        }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] num = new int[];
//        for(int i = 0; i < 4; i++){
//            num[i] = sc.nextInt();
//        }
//        for(int i = 0; i < num.length; i++){
//            System.out.println(num[i]);
//        }
        int[] nums = {1,2,3,4,5,6,7,0};
        int n = count(nums, nums.length);
        System.out.println(n);
    }
}
