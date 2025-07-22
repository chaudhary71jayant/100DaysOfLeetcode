

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLength = minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray with sum at least " + target + " = " + minLength);
    }

    static int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            currSum += nums[end];

            while (currSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                currSum -= nums[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
