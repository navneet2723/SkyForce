

public class Solution2 {
    public static String toLowerCase(String s){
       StringBuilder sb  = new StringBuilder();
       char[] ch = s.toCharArray();

       for(char c : ch){
            if(c>='A' && c<='Z'){
                sb.append((char)(c+32));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "HeLlO";
        System.out.println(toLowerCase(s));
    }
}
