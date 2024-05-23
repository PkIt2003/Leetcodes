class Solution {
    public boolean isArraySpecial(int[] nums) {
       boolean boo = true;
       int len = nums.length;
       if(len==1){
        return boo;
       }
       else{
       for(int i=0;i<len-1;i++){
          if(nums[i]%2==0){
            if(nums[i+1]%2!=0){
                continue;
            }
            else{
                boo = false;
                break;
            }
          }
          else if(nums[i]%2!=0){
            if(nums[i+1]%2==0){
                continue;
            }
            else{
                boo = false;
                break;
            }
          }
       }
     }
     return boo; 
    }
}