/*
 time complexity- O(n)
 space complexity - O(n)
*/

/*
  it solved using hashMap
  it can be somved with Set(add in set then compare length) also with same time and space complexity
*/

import java.util.HashMap;
import java.util.Map;

public class Optimal {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,2,1,5};
        System.out.println(containsDuplicate(nums));
    }
}
