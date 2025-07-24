import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum Window Substring: " + minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency map for characters in t
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length();
        int sIndex = 0; // Start index of the minimum window

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    count--;
                }
                map.put(endChar, map.get(endChar) - 1);
            }

            end++;

            // When all characters are matched
            while (count == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    sIndex = start;
                }

                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        count++;
                    }
                }

                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(sIndex, sIndex + minLen);
    }
}
