
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Day 12 Number of Distinct averages

//https://leetcode.com/problems/number-of-distinct-averages/

public class NumberOfDistincAverages {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};

        System.out.println("The number of distinct averages are : "+distinctAverages(nums));
    }

    static int distinctAverages(int[] nums){
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length-1;

        Map<Double, Integer> map = new HashMap<>();

        while(start < end){
            double avg = (nums[start] + nums[end])/2;

            map.put(avg, 1);
            start++;
            end--;
        }
        return map.size();
    }
}