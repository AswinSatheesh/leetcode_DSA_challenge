import java.util.HashMap;
import java.util.Map;

class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); Both are same
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // throw new IllegalArgumentException("No two sum solution");  // or return null 
        return null;

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumHashMap solution = new TwoSumHashMap();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Result: " + result[0] + ", " + result[1]);
    }
}
