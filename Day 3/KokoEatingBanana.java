//Day 3 => KOko eating bananas

//https://leetcode.com/problems/koko-eating-bananas/

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int hours = 8;

        int res = minFromPile(piles, hours);

        System.out.println("The min no. of bananas she has to eat are : " + res);
    }

    static int minFromPile(int[] piles,int h){
        int start = 1;
        int end = getMax(piles);

        while(start < end){
            int mid = start + (end-start)/2;
            int hours = getHours(piles,mid);

            if(hours > h){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int getMax(int[] piles){
        int max = 0;

        for(int i=0;i<piles.length;i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        return max;
    }

    static int getHours(int[] piles,int k){
        int hours = 0;

        for (int i = 0; i < piles.length; i++) {
            int pile = piles[i];

            if(pile % k == 0){
                hours += pile/k;
            } else {
                hours += (pile/k) +1;
            }
        }
        return hours;
    }
}
