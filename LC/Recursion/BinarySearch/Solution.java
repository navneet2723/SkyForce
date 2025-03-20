class Solution {
    public static int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    static int search(int[] nums, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]  > target){
            return search(nums, target, left, mid-1);
        }else{
            return search(nums,target, mid+1, right);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,6,8,67,78,89};
        int target = 67;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}