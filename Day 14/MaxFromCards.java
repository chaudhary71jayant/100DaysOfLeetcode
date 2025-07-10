//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

//maximum-points-you-can-obtain-from-cards

public class MaxFromCards {

    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxSum = 0;
        int n = cardPoints.length;

        // Take the first k cards from the left
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        maxSum = lsum;

        // Slide the window from left to right
        for (int i = 1; i <= k; i++) {
            lsum -= cardPoints[k - i];       // remove from left
            rsum += cardPoints[n - i];       // add from right
            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int result = maxScore(cardPoints, k);
        System.out.println("Maximum score: " + result);
    }
}

