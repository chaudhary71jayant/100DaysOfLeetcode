

//Day 4 => Find the smalles sum given a threshold

//https://leetcode.com/problems/find-the-smallest-sum-given-a-threshold/

public class Threshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;

        int res = smallestsum(nums, threshold);
        System.out.println("The min sum possible is : " + res);
    }

    static int smallestsum(int[] nums,int threshold){
        int start = 1;
        int end = getMax(nums);

        while(start < end){
            int mid = start + (end-start)/2;
            int sum = getSum(nums, mid);

            if(sum > threshold){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int getMax(int[] nums){
        int max = 0;
        for(int num : nums){
            if(max < num){
                max = num;
            }
        }
        return max;
    }

    static int getSum(int[] nums,int divisor){
        int sum = 0;

        for (int num : nums) {
            sum += (num + divisor -1)/divisor;
        }
        return sum;
    }
}
