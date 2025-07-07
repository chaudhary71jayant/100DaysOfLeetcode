public class Kth{
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};

        System.out.println("The missing number is : " + missingNum(arr, 5));
    }

    static int missingNum(int[] arr,int k){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int missing = arr[mid] - (mid+1);

            if(missing < k){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return end+1+k;
    }
}

/* */