//https://leetcode.com/problemset/all/

public class MaxConsecutiveOnesIII {
    static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0;
        int maxLen = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = longestOnes(nums, k);
        System.out.println("Maximum number of consecutive 1s with at most " + k + " flips: " + result);
    }
}
