

public class Optimal {
    public static int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price: prices){
            minprice = Math.min(minprice,price);
            maxprofit = Math.max(maxprofit,price-minprice);
        }
       return maxprofit;
    }
    public static void main(String[] args){
        int[] arr = {7,6,4,3,1};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
