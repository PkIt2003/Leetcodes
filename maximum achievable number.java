//id-2656//

 //Maximum Sum With Exactly K Elements//



class Solution {
    public int maximizeSum(int[] nums, int k) {
        int large=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large = nums[i];
            }
        }
        int sum = large;
        for(int i=k-1;i>0;i--){
            large++;
            sum =sum+large;
        }
        return sum;
    }
}
