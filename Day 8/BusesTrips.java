//Day 8 Minimum time to complete trips

//https://leetcode.com/problems/minimum-time-to-complete-trips/

public class BusesTrips{
    public static void main(String[] args){
        int[] time = {1,2,3};
        int totalTrips = 5;

        long res = minTime(time, totalTrips);

        if(res == -1){
            System.out.println("It is not possible to complete the totalTrips in the mean time.");
        } else {
            System.out.println("WIll be able to finish the total trips in : " + res);
        }
    }

    static long minTime(int[] time,int totalTrips){
        long start = 1;
        long end = (long) getMin(time) * totalTrips;
        long ans = -1;

        while(start <= end){
            long mid = start + (end - start) / 2;

            if (isPossible(time, mid, totalTrips)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static  boolean isPossible(int[] time, long timeReq, int totalTrips) {
        long trips = 0;
        for (int t : time) {
            trips += timeReq / t;
        }
        return trips >= totalTrips;
    }

    static  int getMin(int[] time) {
        int min = time[0];
        for (int t : time) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }
}