/*
  time complexity--O(n)
  space complexity--O(1)
*/

public class Optimal {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1] ){
            i--;
        }
        if(i >= 0){
            int j =n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
       Optimal optimal = new Optimal();
        int[] nums = {3, 2, 1};
        optimal.nextPermutation(nums);

        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
