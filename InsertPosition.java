class InsertPosition {
    // id - 35
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        int len = nums.length-1;
        if(target<nums[0]){
            index = 0;
        }
        else if(nums.length==0){
            index = 0;
        }
        else if(nums.length==1){
            if(target<nums[0]){
                index = 0;
            }
            else if(nums[0]==target){
                index = 0;
            }
            else{
                index =1;
            }
        }
        else if(target>nums[len]){
            index = len+1;
        }
        else{
            for(int i=0;i<=len;i++){
                if(target==nums[i]){
                    index = i;
                }
                else if(target>nums[i] && target<nums[i+1]){
                    index = (i+1);
                }
            }
        }
        return index;
    }
}