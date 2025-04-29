import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return new int[] { map.get(sub), i };
            }

            map.put(curr, i);
        }

        return null;
    }
}