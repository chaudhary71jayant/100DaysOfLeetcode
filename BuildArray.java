//This is day 1 and problem 1.

// https://leetcode.com/problems/build-array-from-permutation/

public class BuildArray{
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int[] outputArr = newArray(nums);

        System.out.println("The new array we got is : ");
        for(int i=0;i<outputArr.length;i++){
            System.out.print(" " + outputArr[i]);
        }
    }

    static int[] newArray(int[] nums){
        int n = nums.length;
        int ans[] = new int[n]; //creating a new array ans of same length as nums

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];        
        }
        return ans; //returning new array ans
    }
}