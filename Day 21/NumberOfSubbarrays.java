import java.util.*;

public class NumOfNiceSubarrays{
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays with exactly " + k + " odd numbers = " + result);
    }

    static int numberOfSubarrays(int[] nums, int goal) {
        return countAtmost(nums,goal) - countAtmost(nums,goal-1);
    }

    static int countAtmost(int[] nums,int target){
        int start=0,end=0,count=0,sum=0;
        if(target<0) return 0;

        while(end<nums.length){
            sum+= nums[end]%2;
            while(sum>target){
                sum -= nums[start]%2;
                start++;
            }
            count += end-start+1;
            end++;
        }
        return count;
    }
}