// max consequtive ones

//https://leetcode.com/problems/max-consecutive-ones/

public class MaxCons {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};

        int res = findMaxConsequtives(nums);

        System.out.println("The max ones are : " + res);
    }

    static int findMaxConsequtives(int[] nums){
        int count = 0;
        int maxCount = 0;

        for(int num : nums){
            if(num == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
