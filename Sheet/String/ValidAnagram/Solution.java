

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t){
         Map<Character,Integer> charCountMap = new HashMap<>();

        for(char c: s.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }

        for( char c: t.toCharArray()){
            if(!charCountMap.containsKey(c)){
                return false;
            }
            charCountMap.put(c,charCountMap.get(c)-1);
        }
        for(int count : charCountMap.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
