// id-2535 //

// Difference Between Element Sum and Digit Sum of an Array//


class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int digitsum = 0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>9){
                while(nums[j]>0){
                    digitsum+=(nums[j]%10);
                    nums[j]=nums[j]/10;
                }
            }
            else{
                digitsum+=nums[j];
            }
        }
        return elementsum -digitsum;
    }
}