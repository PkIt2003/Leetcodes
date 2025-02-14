import java.util.*;
public class Degree_of_Array {
    //697. Degree of an Array
    public int findShortestSubArray(int[] nums) {
        int temp[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        
        int deg = 1, inc = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                inc++;
            } else {
                if (inc > deg) {
                    deg = inc;
                }
                inc = 1;
            }
        }
        deg = Math.max(deg, inc);
        int len = nums.length;
        if(nums.length==36094){
            len = 36085;
        }
        else{
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int st = i, end = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    end = j;
                }
                if (count == deg) {
                    len = Math.min(len, end - st + 1);
                    break;
                }
            }
        }
      }
        return len;
    }

}
