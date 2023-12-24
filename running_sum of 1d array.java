//id-1480.// 

//Running Sum of 1d Array//

class Solution {
    public int[] runningSum(int[] nums) {
        int len =nums.length;
        for(int i=1;i<=len-1;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;

    }
}