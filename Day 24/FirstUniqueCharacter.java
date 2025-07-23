public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int index = firstUniqChar(s);
        if (index != -1) {
            System.out.println("First unique character: '" + s.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }

    static int firstUniqChar(String s) {
        int[] freq = new int[26];  // only lowercase letters

        // First pass: Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
