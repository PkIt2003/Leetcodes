public class ReplaceZeros {
    public void moveZeroes(int[] nums) {
        // id - 283
        for(int first=0;first<nums.length;first++){
            for(int second = first+1;second<=nums.length-1;second++){
                if(nums[first]==0){
                    if(nums[second]!=0){
                        int temp = nums[second];
                        nums[second] = nums[first];
                        nums[first] = temp;
                        break;
                    }
                }
            }
        }
    }
}
