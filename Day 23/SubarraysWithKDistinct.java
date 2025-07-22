import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int count = subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly " + k + " distinct integers: " + count);
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0, count = 0;

        for (int end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while (map.size() > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) map.remove(nums[start]);
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
}
