//Day 7 solved the problem of the day

//https://leetcode.com/problems/find-the-original-typed-string-i/

public class DaySevenOne{
    public static void main(String[] args) {
        String word = "abbcccc";

        System.out.println("The possible string count is : " + possibleStringCOunt(word));
    }

    static int possibleStringCOunt(String word){
        int n = word.length();
        int ans = 1; //we set the answer one because even if she typed all letter once there will be min possible string is one only

        for (int i = 1; i < n; i++) {
            if(word.charAt(i-1) == word.charAt(i)){
                ++ans;
            }
        }
        return ans;
    }
}