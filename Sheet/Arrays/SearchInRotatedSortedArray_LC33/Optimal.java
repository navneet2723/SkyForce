package Sheet.Arrays.SearchInRotatedSortedArray_LC33;
/*
    time complexity--O(logn)
*/

public class Optimal {
    public static int search(int[] nums, int target){
        int i =0;
        int j = nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[i] <= nums[mid] ){
                if(nums[i] <= target && target < nums[mid]){
                    j = mid-1;
                }else{
                    i = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[j]){
                    i = mid+1;
                }else{
                    j = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,0);
        System.out.println(ans);
    }
}
