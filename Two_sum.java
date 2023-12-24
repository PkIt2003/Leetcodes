//id-1.// 

//Two Sum//

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoindices = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<=(nums.length)-1;j++){
                if(nums[i]+nums[j]==target){
                    twoindices[0]=i;
                    twoindices[1]=j;
                }
            }
        }
        return twoindices;
    }
}