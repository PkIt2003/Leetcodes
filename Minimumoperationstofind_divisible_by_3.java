class Solution {
    public int minimumOperations(int[] nums) {
        int oper =0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                continue;
            }
            else{
                int ttemp = nums[i]+1;
                int ttemp2 = nums[i]-1;
                if(ttemp%3==0 || ttemp2%3==0){
                    oper++;
                }
            }
            
        }
        return oper;
    }
}