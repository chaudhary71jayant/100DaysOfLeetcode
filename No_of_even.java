//Solution for the leetcode problem finding the number of even digits elements in the integer array 
// Here are both the cases the 1ms solution and the 0ms solution as well.

public class No_of_even{
    public static void main(String[] args) {
        int[] arr = {33,44,55,66,7,8,90,5};

        System.out.println("Number of even elements are : " + solution(arr));
    }

    static int solution(int[] arr){
     /* int count = 0;
        for (int i: arr){
            int len = String.valueOf(i).length();
            if(len%2 == 0){
                count++;
            }
        }
        return count; */

        int count = 0;
        for(int i: arr){
            if((int) (Math.log10(i) + 1) % 2 == 0){
                count ++;
            }
        }
        return count;
    }
}