public class LargestNUmAttwice {
        public int dominantIndex(int[] nums) {
            // id-747. Largest Number At Least Twice of Others
            int max = Integer.MIN_VALUE; 
            int index =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                    index = i;
                }
            }
            for(int j=0;j<=nums.length-1;j++){
                if((nums[j]*2)>max && j!= index){
                    index = -1;
                    break;
                }
                else{
                    continue;
                }
            }
            return index;
            
        }
}
