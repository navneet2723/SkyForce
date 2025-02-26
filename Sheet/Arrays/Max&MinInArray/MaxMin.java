import java.util.*;
public class MaxMin{
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr = {3,2,1,56,10000,167};
        int ans1 =min(arr);
        int ans2 =max(arr);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}