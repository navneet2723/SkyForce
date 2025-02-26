/*
  space complexity--O(n)
  time complexity--O(n)---but it uses unnecessary stringbuilder
*/

public class BFA {
    public static String restorteString(String s, int[] indices){
        StringBuilder sb  = new StringBuilder();
        char[] result = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        return (sb.append(result)).toString();
    }
    public static void main(String[] args){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restorteString(s, indices));
    }
}
