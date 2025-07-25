public class MaxConsecutiveOnes{
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0, big=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > big){
                    big = count;
                }
            }else{
                count =0;
            }
        }
        return big;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Max consecutive 1s: " + result);
    }
}