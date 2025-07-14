import java.util.*;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3}; // Example input
        int result = totalFruit(fruits);
        System.out.println("Maximum number of fruits in basket: " + result);
    }

    static  int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, start = 0, end = 0;

        while (end < fruits.length) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
