//Day 2 with the rotated sorted array II already solved search in rotated sorted array before

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRoatatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,6,7,0,0,1,2,3};
        int target = 0;

        boolean res = search(nums, target);

        if(res){
            System.out.println("The number exsist in the array.");
        } else {
            System.out.print("The number does not exsist in the array.");
        }
    }

    static  boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot != -1 && nums[pivot] == target){
            return true;
        }

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1) != -1;
        }
        
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot+1) != -1;
        }
        return binarySearch(nums,target,pivot+1,nums.length-1) != -1;


    }


    //pivot with dublicates
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //4 cases

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            } 

            if(mid> start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
              if(start < end && nums[start] > nums[start+1]){
                return start;
              }
              start++;

              if(end > start && nums[end] < nums[end-1]){
                return end-1;
              }
              end--;
              } else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]){
                start = mid+1;
              } else {
                end = mid-1;
            }
        }
        return -1;
    }

    static  int binarySearch(int[] nums, int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

}

