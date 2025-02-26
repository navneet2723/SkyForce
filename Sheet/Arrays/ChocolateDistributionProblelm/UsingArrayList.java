package Sheet.Arrays.ChocolateDistributionProblelm;
/*
  time complexity--O(n)
  space complexity -- O(1)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingArrayList {
    public static  int findMinDiff(ArrayList<Integer> arr, int m) {
        int n  = arr.size();
        
        if(n<m){
            return -1;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i+m-1 < n; i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            
            minDiff = Math.min(minDiff,diff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        // Directly initializing the ArrayList using Arrays.asList()
        ArrayList<Integer> chocolates = new ArrayList<>(Arrays.asList(12, 4, 7, 9, 2, 23, 25, 41, 40, 40, 48, 59));
        
        int m = 5;  
        
        int result = findMinDiff(chocolates, m);
        System.out.println("The minimum difference is: " + result);
    }
}
