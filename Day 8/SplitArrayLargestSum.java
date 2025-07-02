//Day 8 : Split array largest sum leetcode hard

//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int result = sol.splitArray(nums, k);
        System.out.println("The minimum largest sum after splitting the array into " + k + " parts is: " + result);
    }
}

class Solution {
    public int splitArray(int[] nums, int k) {
        int start = getMax(nums);
        int end = getSum(nums);

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (pieces(nums, mid) > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // or return start
    }

    public int pieces(int[] nums, int maxSum) {
        int sum = 0;
        int pieces = 1;

        for (int n : nums) {
            if (sum + n > maxSum) {
                sum = n;
                pieces++;
            } else {
                sum += n;
            }
        }

        return pieces;
    }

    public int getMax(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public int getSum(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }
}
