// time complexity -- O(n)

public class BFA {
    // public static int search(int[] nums, int target) {
    //     int pivot = findPivot(nums);

    //     if (pivot == -1){
    //        return linearSearch(nums,target);
    //     }
    //         reverse(nums,0,pivot);
    //         reverse(nums,pivot,nums.length-1);
    //         reverse(nums,0,nums.length-1);
    //         return linearSearch(nums,target);
        
    // }
    public static int linearSearch(int[] nums, int target){
        for(int i =0; i< nums.length;i++){
            if(nums[i] == target){
                
                return target;
            }
        }
        return -1;
    }
    // public static void reverse(int[] arr, int m, int n){
    //     while(m < n){
    //         int temp = arr[m];
    //         arr[m] = arr[n];
    //         arr[n] = temp;
    //         m++;
    //         n--;
    //     }
    // }
    // public static int findPivot(int[] arr){
    //     for(int i =0; i < arr.length; i++){
    //         if(arr[i] > arr[i+1]){
    //             System.out.println("Now pivot is "+i);
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int ans = linearSearch(arr,0);
        System.out.println(ans);
    }
}
