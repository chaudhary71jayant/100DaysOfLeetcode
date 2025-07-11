//Contains Duplicate 

//https://leetcode.com/problems/contains-duplicate/


public class ContainDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};

        boolean result = contains(nums);
        System.out.println("Contains duplicate? " + result);
    }

    static boolean contain(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
