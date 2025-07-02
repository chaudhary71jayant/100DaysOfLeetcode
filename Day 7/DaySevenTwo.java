//Day 7 Second problem Capacity to ship packages within D days 

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public  class DaySevenTwo{
    public  static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int expectedCapacity = shipWithinDays(weights, days);

        System.out.println("The minimum capacity with which ship will ship all the packages within " + days + "days is : " + expectedCapacity);
    }

     static  int shipWithinDays(int[] weights, int days) {
        int start = getMax(weights);
        int end = getSum(weights);

        while(start <= end){
            int mid = start + (end-start)/2;

            if(daysNeeded(weights,mid) <= days){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
    
    static  int daysNeeded(int[] weights,int capacity){
        int days = 1;
        int load = 0;

        for(int weight : weights){
            if(weight + load > capacity){
                days++;
                load = 0;
            }
            load += weight;
        }
        return days;
    }

    static  int getMax(int[] weights){
        int max = 0;
        for(int weight : weights){
            if(weight > max){
                max = weight;
            }
        }
        return max;
    }

    static  int getSum(int[] weights){
        int sum = 0;
        for(int weight : weights){
            sum += weight;
        }
        return sum;
    }
}
