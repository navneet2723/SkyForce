

public class BFA {

    public static int maxProfit(int[] arr){
        int maxxProfit = Integer.MIN_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i =0; i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                profit = arr[j] - arr[i];

                maxxProfit = Math.max(profit,maxxProfit);
            }
        }
        
        return Math.max(maxxProfit,0);
    }
    public static void main(String[] args){
        int[] arr = {7,6,4,3,1};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
