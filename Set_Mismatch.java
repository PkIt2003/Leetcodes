import java.util.Arrays;
public class Set_Mismatch {
    // id-645. Set Mismatch
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int len = nums.length;
        String str = "," + Arrays.toString(nums).replaceAll("[\\[\\] ]", "") + ",";
        for (int i = 1; i <= len; i++) {
            String index = "," + i + ",";
            if (!str.contains(index)) {
                arr[1] = i;
                break;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                arr[0] = nums[i]; 
                break;
            }
        }
        return arr;
    }
}
