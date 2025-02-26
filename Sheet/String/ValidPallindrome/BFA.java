public class BFA {

    public static boolean isPalindrome(String s){
        StringBuffer filteredString = new StringBuffer();

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                filteredString.append(c);
            }
            int start = 0;
            int end = s.length()-1;
            while(start < end ){
                if(s.charAt(start) != s.charAt((end))){
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
