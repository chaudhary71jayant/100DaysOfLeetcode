//Maximum Average SubArray -1

//https://leetcode.com/problems/maximum-average-subarray-i/

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        double result = findMaxAverage(nums, k);
        System.out.println("Maximum average of subarray of size k: " + result);
    }

    static double  findMaxAverage(int[] nums,int k){
        int n = nums.length;
        int windowSum = 0;

        int currentSum = 0;
        for(int i=0;i<k;i++){
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k]; // add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum/k;
    }
}
