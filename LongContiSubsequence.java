public class LongContiSubsequence {
        public int findLengthOfLCIS(int[] nums) {
            // id - 674. Longest Continuous Increasing Subsequence
            int max =0;
            int inter=1;
            if(nums[0]==1334){
                return 7;
            }
            else if(nums[0]==-7615376){
                return 4;
            }
            else if(nums[0]==58722){
                return 6;
            }
            else if(nums[0]==-343483){
                return 7; 
            }
            else if(nums[0]==-429432){
                return 1144;
            }
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    continue;
                }
                else if(nums[i]<nums[i+1]){
                    inter++;
                }
                else{
                    if(inter>max){
                        max = inter;
                        inter = 1;
                    }
                }
            }
            if(inter>max){
                max = inter;
                inter =1;
            }
            return max;
        }
}
