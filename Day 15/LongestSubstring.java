//Longest substring without repeating characters

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }

    static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int start=0,end=0,maxLen=0;

        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                maxLen = Math.max(maxLen, end-start+1);
                end++
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
}
