//Day 5 => Minimum number of days to make m bouquets

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

public class Bouquets{
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;

        int res = minDays(bloomDay, k, m);

        if(res == -1){
            System.out.println("It's not possible to make the bouquets in k sequence in min days.");
        } else {
            System.out.println("The min no. days needed to make bouquets is : " + res);
        }
    }

    static int minDays(int[] bloomDay,int k,int m){
        int start = getMin(bloomDay);
        int end = getMax(bloomDay);

        if(m*k > bloomDay.length) return -1;

        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(canPossible(bloomDay, k, m, mid)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    static int getMax(int[] bloomDay){
        int max = bloomDay[0];

        for (int b : bloomDay) {
            if(b > max){
                max = b;
            }
        }
        return max;
    }

    static int getMin(int[] bloomDay){
        int min = getMax(bloomDay);
        for(int b : bloomDay){
            if(min > b){
                min = b;
            }
        }
        return min;
    }

    static boolean canPossible(int[] bloomDay,int k,int m,int day){
        int boquets = 0, flowers = 0;

        for(int d : bloomDay){
            if(d <= day){
                flowers++;

                if(flowers == k){
                    boquets++;
                    flowers =0;
                    if(boquets == m){
                        return true;
                    }
                }
            } else {
                flowers=0;
            }
        }
        return false;
    }

}