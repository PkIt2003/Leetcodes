// 3028. Ant on the Boundary // 
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum =0;
        int retrn = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            if(sum==0){
                retrn++;
            }
        }
        if(retrn==0){
            return 0;
        }
        return retrn;
        
    }
}