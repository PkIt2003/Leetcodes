//id-2176.// 

//Count Equal and Divisible Pairs in an Array//

class Solution {
    public int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=(nums.length)-1;j++){
                    if(nums[i]==nums[j]){
                        if((i*j)%k==0){
                            count++;
                        }
                    }
            }

        }
        return count;
    }
}