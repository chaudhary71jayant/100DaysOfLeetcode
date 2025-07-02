//Problem 2 of Day1 similar to last problem #basics of the array

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,6,8};

        int[] res = runningSum(nums);

        System.out.print("The array we got is : ");
        for (int i = 0; i< res.length;i++) {
            System.out.print(" " + res[i]);
        }
    }

    static int[] runningSum(int[] nums){
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for(int i=1;i< nums.length;i++){
            sum[i] = nums[i] + sum[i-1];
        }
        return sum;
    }
}
