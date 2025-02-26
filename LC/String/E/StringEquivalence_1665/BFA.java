/*
    time complexity--O(m+n)
    space complexity--O(m+n)---but better only for small data
*/

public class BFA {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String s1 = String.join("",word1);
        String s2 = String.join("",word2);

        return s1.equals(s2);
    }
    public static void main(String[] args){
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
