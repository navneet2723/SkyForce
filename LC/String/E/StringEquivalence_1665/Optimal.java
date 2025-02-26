/*
    time complexity--O(m+n)
    space complexity--O(m+n)---but better for larger data
*/

public class Optimal {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();

        for(String word : word1){
            sb1.append(word);
        }
        for(int i =0; i<word2.length;i++){
            sb2.append(word2[i]);
        }
        return ((sb1.toString()).equals(sb2.toString()));
    }
    public static void main(String[] args){
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
