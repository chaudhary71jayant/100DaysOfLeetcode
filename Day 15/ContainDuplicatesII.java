//Contain Duplicate II SLiding window problem

//https://leetcode.com/problems/contains-duplicate-ii/


import java.util.*;

public class ContainDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = containDuplicate(nums, k);
        System.out.println("Contains nearby duplicate within k? " + result);
    }

    static boolean containDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0, end = 0;

        while (end < nums.length) {
            if (set.contains(nums[end])) {
                return true;
            }

            set.add(nums[end]);

            if (end - start >= k) {
                set.remove(nums[start]);
                start++;
            }
            end++;
        }
        return false;
    }
}
