//Day 4 : Leetcode Easy question

//https://leetcode.com/problems/concatenation-of-array/

public class ArrayConcat{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,3,2,1};

        int[] res = getConcatenation(nums);

        System.out.print("The array after concatanation : ");
        for(int num : res){
            System.out.print(" " + num);
        }
    }

    static  int[] getConcatenation(int[] nums) {
        int[] nums2 = nums.clone();

        int[] result = new int[nums.length + nums2.length];

        for(int i = 0;i<nums.length;i++){
            result[i] = nums[i];
        }

        for(int i=0;i<nums2.length;i++){
            result[nums.length + i] = nums2[i];
        }

        return result;        
    }

}