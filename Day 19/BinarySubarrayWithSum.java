//https://leetcode.com/problems/binary-subarrays-with-sum/

public class BinarySubarrayWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }

    // Helper: count number of subarrays with sum at most target
    private static int countAtMost(int[] nums, int target) {
        if (target < 0) return 0;  // negative target means 0 subarrays

        int start = 0, sum = 0, count = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > target) {
                sum -= nums[start++];
            }

            count += (end - start + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = numSubarraysWithSum(nums, goal);
        System.out.println("Total subarrays with sum = " + goal + " : " + result);
    }
}
