
 /*
    time complexity--O(n)
    space complexity--O(1)
*/
// this is solved using kadane's algorithm

public class Optimal {
    public static int kadaneAlgo(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum+=arr[i];
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
            // if(maxSum<currentSum){
            //     maxSum = currentSum;
            // }
            
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = kadaneAlgo(arr);
        System.out.println(ans);
    }
}
