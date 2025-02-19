
/*
 time complexity- O(nlogn)
 space complexity - O(n)
*/
import java.util.Arrays;

public class BFA {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;        
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,1,5};
        System.out.println(containsDuplicate(nums));
    }
}
