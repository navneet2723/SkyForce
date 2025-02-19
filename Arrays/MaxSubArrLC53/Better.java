/*
    time complexity--O(n²)
    space complexity--O(1)
*/
// this method is known as Prefix sum

public class Better {
    public static int calMaxSum(int[] arr){
        int maxSubArr = Integer.MIN_VALUE;
        int n = arr.length-1;

        for(int i = 0; i<=n ;i++){
            int sum =0;
            for(int j = i; j<=n; j++){
                
                    sum+=arr[j];
               
                if(maxSubArr < sum){
                    maxSubArr = sum;
                }
            }
        }
        return maxSubArr;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = calMaxSum(arr);

        System.out.println(ans);
    }
}
