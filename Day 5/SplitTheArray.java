import java.util.*;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4,5};

        boolean res = isPossibleToSplit(nums);

        if(res){
            System.out.println("Possible to split array into two with distinct element,");
        } else {
            System.out.println("Not possible.");
        }
    }

    static boolean isPossibleToSplit(int[] nums){
        Arrays.sort(nums);

        int count = 1; //Initially count for unique number will always be 2

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
                if(count > 2){
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return false;
    }
}
