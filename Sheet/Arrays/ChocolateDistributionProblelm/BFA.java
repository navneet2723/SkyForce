package Sheet.Arrays.ChocolateDistributionProblelm;
/*
  time complexity--O(n)
  space complexity -- O(1)
 */
import java.util.*;
public class BFA {
    public static int findMinDiff(int[] arr, int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
       int i =0;
       int j = i+m-1;
        
        while(j<arr.length){
            int trackDiff = arr[j]-arr[i];
            if(min > trackDiff){
                min = trackDiff;
            }
            i++;
            j++;
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m =5;
        int minDiff = findMinDiff(arr,m);
        System.out.println(minDiff);

        int[] arr2 = {7, 3, 2, 4, 9, 12, 56};
        int m2 = 3;
        System.out.println(findMinDiff(arr2, m2));

        int[] arr3 = {3, 4, 1, 9, 56};
        int m3 = 5;
        System.out.println(findMinDiff(arr3,m3));   
    }
}
