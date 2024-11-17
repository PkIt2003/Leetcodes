import java.util.*;
public class ElementwitMaxfreq {
    //id-3005. Count Elements With Maximum Frequency
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        for (int value : hash.values()) {
            maxFreq = Math.max(maxFreq, value);
        }
        int totalOccurrences = 0;
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == maxFreq) {
                totalOccurrences += entry.getValue();
            }
        }
        return totalOccurrences;
    }

}
