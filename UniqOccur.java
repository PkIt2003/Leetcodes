import java.util.HashMap;
import java.util.HashSet;
public class UniqOccur {
    // id-1207. Unique Number of Occurrences
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occur = new HashMap<>();
        for (int num : arr) {
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> occurrenceSet = new HashSet<>();
        for (int count : occur.values()) {
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }
        return true; 
    }
}

