//Day 9 => Special Array I

//https://leetcode.com/problems/special-array-i/

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {2,1,4};

        if(isArraySpecial(nums)){
            System.out.println("The array is a special array.");
        } else {
            System.out.println("The array is not  a special array.");
        }
    }

    static  boolean isArraySpecial(int[] nums) {
        for(int i= 1;i < nums.length;i++){
            if(parity(nums[i]) == parity(nums[i-1])){
                return false;
            }  
        }
        return true;
    }

    static int parity(int num){
        if(num % 2 == 0){
            return 1;
        } else {
            return -1;
        }
    }
}
