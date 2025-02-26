/*
    time complexity--O(n)
    space complexity--O(n)----auxi
*/

public class Solution {
    public static String removeConsecutiveCharacter(String s) {
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i< s.length(); i++){
            if(i==0 || s.charAt(i) != s.charAt(i-1)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        String s = "aabaa";
        System.out.println(removeConsecutiveCharacter(s));

        
    }
}
