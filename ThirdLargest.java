import java.util.*;
 // id-414. Third Maximum Number
public class ThirdLargest {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int last = list.size();
        if (last < 3) {
            return list.get(last - 1);
        } else {
            return list.get(last - 3); 
        }
    }

}
