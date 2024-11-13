import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        // id-268. Missing Number
        Arrays.sort(nums);
        int len = nums.length;
        int lost = 0;
        for (int i = 0; i <= len; i++) {
            int current = lost;
            boolean boo = Arrays.stream(nums).anyMatch(n -> n == current);
            if (boo) {
                lost++;
            } else {
                break;
            }
        }
        return lost;
    }
}

