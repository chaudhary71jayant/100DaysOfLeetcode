//Day 11 Find the lucky number in the array

//https://leetcode.com/problems/find-lucky-integer-in-an-array/

import java.util.*;
public class LuckyInteger {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,3,3,4};
       
       int res = findLucky(arr);

       if(res == -1){
        System.out.println("There is no such number");
       } else {
        System.out.println("The lucky number is : " + res);
       }
    }

    static int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find elements where frequency == value
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (number == frequency) {
                result = Math.max(result, number);
            }
        }

        return result;
    }
}
