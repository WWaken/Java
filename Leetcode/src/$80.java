public class $80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,6};
        removeDuplicates(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }

    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int index = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[index-2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
