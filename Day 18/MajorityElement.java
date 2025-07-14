import java.util.*;

public class MajorityElement {
    Static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > n / 2) return num;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; // Example input
        int majority = majorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }

}
