

public class Optimal {
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while(start < end ){
            char currFirst = s.charAt(start);
            char currLast = s.charAt(end);
            
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                end--;
            }else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
            
        }
        
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // Output: true
        System.out.println(isPalindrome("race a car"));  // Output: false
        System.out.println(isPalindrome(" "));
    }
}
