//id-1920.// 

//Build Array from Permutation//

class Solution {
    public int[] buildArray(int[] nums) {
        int ans;
        int[] pernums = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans =nums[i];
            pernums[i]=nums[ans]; 
  
      }
        return pernums;
    }
}