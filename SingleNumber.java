import java.util.Arrays;

public class SingleNumber {
    // id-136. Single Number
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int dup =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    nums[i] = -100;
                    nums[j] = -100;
                }
                
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-100){
                dup = nums[i];
                break;
            }
        }
        return dup;
    }
}


