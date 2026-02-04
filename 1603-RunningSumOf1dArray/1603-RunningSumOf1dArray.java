// Last updated: 04/02/2026, 22:41:56
class Solution {
    public int[] runningSum(int[] nums) {
         int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
        
    }
}