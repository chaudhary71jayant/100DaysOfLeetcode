//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

public class NumberOfSubstringsWithABC {

    // Function to count number of substrings containing at least one 'a', 'b', and 'c'
    static int numberOfSubstrings(String s) {
        int[] count = new int[3]; // count[0] -> 'a', count[1] -> 'b', count[2] -> 'c'
        int start = 0, end = 0, result = 0;

        while (end < s.length()) {
            // Increment count for current end character
            count[s.charAt(end) - 'a']++;

            // While we have at least one 'a', 'b', and 'c', count substrings
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += (s.length() - end);
                count[s.charAt(start) - 'a']--;
                start++;
            }

            end++;
        }

        return result;
    }

    // Main function to run and test
    public static void main(String[] args) {
        String s = "abcabc";
        int totalSubstrings = numberOfSubstrings(s);
        System.out.println("Total substrings containing at least one 'a', 'b', and 'c': " + totalSubstrings);
    }
}
