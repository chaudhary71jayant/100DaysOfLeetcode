//Day 10 Intersection of two arrays

//https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = intersection(nums1, nums2);

        for(int i=0;i<nums3.length;i++){
            System.out.println(" " + nums3[i]);
        }
    }

    static  int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int prev = Integer.MIN_VALUE;
        for(int num : nums1){
            if(num == prev){
                continue;
            }

            if(bs(nums2,num)){
                result.add(num);
            }
            prev = num;
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    static  boolean bs(int[] arr,int target){
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
